/*
 *  ExtractIng. An automated metadata extraction program 
 *  for simulation codes.
 *    
 *  Copyright (C) 2018,2019,2020  Bjoern Schembera, HLRS
 *  
 *  This file is part of ExtractIng (was: Harvester).
 *
 *  ExtractIng is free software: you can redistribute it 
 *  and/or modify it under the terms of the GNU General Public License 
 *  as published by the Free Software Foundation, either version 3 of 
 *  the License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 */

package ExtractIng;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FilenameFilter;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.PairFunction;

import scala.Tuple2;

/**
 * 
 * This class implements the parallel extraction with the use of the Spark Data
 * Analytics Framework.
 * 
 * @author hpcbsche
 *
 */

public class SparkExtractIng extends ExtractIng implements java.io.Serializable {
	// Class must be serializable, otherwise Spark won't accept it

	// Variable might be needed if HDFS support should be included
	public static Boolean HDFS = false;

	/**
	 * The method implements the parallel metadata extraction. Basically, it follows
	 * the same logic as the native approach: Looping through the config file,
	 * reading each line and searching and extracting metadata information just
	 * according to the information sepecified in the config file. However, the
	 * inner loop of the native approach is replaced by the parallel function of
	 * Spark, e.g. filter and mapper-functions.
	 * 
	 * 
	 * @param confFile
	 *            The configuration file
	 * @param inputDir
	 *            The directory where the data to parse is found
	 * @return The extracted information in the nested HashMap
	 * @throws Exception
	 */

	@SuppressWarnings("unchecked")
	public Map<String, HashMap<Integer, String>> parse(String confFile, String inputDir) throws Exception {

		// Config file is defined here
		File confFileObj = new File(confFile);

		// If the directory does not end with a slash, this is added.
		// Needed because Spark won't accept dirs not ending with a slash
		if (!inputDir.endsWith("/"))
			inputDir = inputDir + "/";

		// The directory to parse
		File userdir = new File(inputDir);

		String dataSuffix = "foo";
		
		// Leading and Trailing Characters that should be cutted
		String[] extraChar = {};

		// Begin Spark Stuff: Set the application name and start Spark context
		SparkConf conf = new SparkConf().setAppName("ExtractIng");
		JavaSparkContext sc = new JavaSparkContext(conf);

		// This data structure holds the metadata file suffixes and the RDD data
		// structure
		// like: (job, jobRDD), (log, logRDD), (gro, groRDD), ...
		Map<String, JavaRDD> metadataFiles = new HashMap<>();

		/*
		 * 
		 * PREPERATORY LOOP THORUGH CONFIG FILE
		 * 
		 * One first loop through the config file to check for the parameters - code -
		 * checksumming. Moreover with this preliminary run through the config file, all
		 * the text files that contain metadata are preloaded and put to a HashMap
		 * datastructure so they can be associated with a key. So the text files have to
		 * be loaded only once in a RDD data structure.
		 * 
		 */

		try {

			// Open the file for scanning
			Scanner sca = new Scanner(confFileObj);

			while (sca.hasNextLine()) {
				// loop through every line
				String i = sca.nextLine();

				// Separate the lines by comma to get the MDKey, File, Search Key, Delimiter
				// information
				// if present
				String[] segsScan = i.split(Pattern.quote(","));

				// split the line by = to get the file, code and additional information
				String[] segs = i.split(Pattern.quote("="));

				if (!i.startsWith("#")) { // only if not commented, process this line

					// Check for the specific simulation code
					if (segs[0].equals("code")) {

					}

					if (segs[0].equals("data")) {

						dataSuffix = segs[1];

					}
					
					// If there are leading and trailing characters defined in the config file
					if (segs[0].equals("char_to_cut")) {
						
						extraChar = segs[1].split(Pattern.quote(","));
						
						//If comma itself should be omitted, too, uncomment these lines:
						extraChar = Arrays.copyOf(extraChar, extraChar.length + 1);
						extraChar[extraChar.length - 1] = ",";
						
					}

					// Only if checksumming is enabled in the config file, do it.
					if (segs[0].equals("checksum")) {

						if (segs[1].equals("yes")) {
							checksum = true;
						} else {
							checksum = false;
						}

					}

					if (segsScan.length > 2) { // if we found the MDKey, File, ... entries, continue getting the file
												// information

						// Fill up an Map(Key,Value)-pairs with the key as the File suffix description
						// and the value is the RDD object that fits to the key
						if (!metadataFiles.containsKey(segsScan[1])) {
							if (HDFS == false) {
								metadataFiles.put(segsScan[1],
										sc.textFile("file://" + inputDir + "*" + segsScan[1]).cache());
							} else {
								metadataFiles.put(segsScan[1],
										// sc.textFile(inputDir + "*" + segsScan[1]).cache());
										sc.textFile("/ALL_SSD/hpcbsche/run2/" + "*" + segsScan[1]).cache());
							}

						}
					}

				}

			}

			sca.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		final String finalDataSuffix = dataSuffix;
		final String [] finalExtraChar = extraChar;

		// List of all data Files/non-MD files
		File[] dataFiles = userdir.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File f, String s) {
				return new File(f, s).isFile() && s.contains(finalDataSuffix);
			}
		});

		if (dataFiles.length == 0) { // if there are no data files present, exit
			System.err.println("There are no data files in the specified directory... Exiting.");
			System.exit(1);
		}

		/*
		 * 
		 * MAIN LOOP FOR PARSING
		 * 
		 * Main program logic here: depending on what is found in the config file,
		 * parsing of all job, log, ... files is done here. With the outerloop, we loop
		 * through the config file. Only lines containting the parsing information
		 * (format: metadatakey, file, searchkey, delimiter, semantics) are considered.
		 * Then, for each of the above lines, in the innerloop, the respective file,
		 * which is already preloaded, is searched with Spark filter function based on
		 * regular expressions. The result is then saved to a one-dimensional RDD data
		 * structure. The result lines are then mapped to a two-dimensional RDD
		 * depending on the demiliter. Then, these mapped RDD results are unionized with
		 * the two-dimensional RDD "MDKV" containing all the key,valus metadata paris.
		 * 
		 * 
		 */

		try {

			Scanner sca = new Scanner(confFileObj);

			outerloop: while (sca.hasNextLine()) {

				// Scan the config file line for line
				String i = sca.nextLine();
				if (!i.startsWith("#")) { // only if not commented, process this line

					// split the line by , to get the metadata information
					String[] segsMD = i.split(Pattern.quote(","));

					if (segsMD.length > 3) {
						// Check if scanned line is not empty/or contains only spaces

						/*
						 * 
						 * Start the actual parsing for Metadata here: For each Metadata key in the
						 * config file (as defined in the EngMeta schema), the code checks in the file
						 * defined in the conf file for the search key also defined in the conf file.
						 * The check works with the Spark filter function and returns a RDD which then
						 * is further processed either by a mapper function or by a helper function in
						 * some cases. This maps the found results to a Key,Value pair data structure
						 * which is easy to output.
						 *
						 * Basically, there are two phases: In the first phase, the text/log/job file is
						 * loaded to an RDD data structure, however onle the matching lines are loaded.
						 * Then, in a second phase, the data is mapped in a ways that it is split
						 * according to a certain delimiter definition from the config file and
						 * transformed to a key,value form.
						 * 
						 */

						// General definition Metadata Key, File Suffix, Search Key and Delimiter for
						// each line in the config file

						// The variables that hold the information from the segsMD array:
						// [MDKey,fileSuffix,searchKey,delim,semantics]

						final String MDKey = segsMD[0];
						final String fileSuffix = segsMD[1];
						final String searchKey = segsMD[2];
						String tmpDelim = segsMD[3];

						if (tmpDelim.trim().equals("space")) {
							// in case a whitespace should be the delimiter,
							// insert a special character
							tmpDelim = "\\s+";
						}

						final String delim = tmpDelim;

						/*
						 * Check for associated entries. Entries are associated by the number in their
						 * fifth field in the config file. This field in the config file defines which
						 * metadata keys belong together. Inside the code, it is used as the index to
						 * define the position in the HashMap data structure.
						 */

						String tmpSemantics;

						if (segsMD.length > 4) { // only if the last field exists, take its value as the position for
													// the MD entry
							tmpSemantics = segsMD[4];
						} else { // if it doesn't exist suppose the it it the first MD entry
							tmpSemantics = "1";
						}

						final String semantics = tmpSemantics;

						int index;

						if (semantics.equals("1") || semantics.isEmpty()) {// if the field as the value 1 or is empty,
																			// then suppose the first position
							index = 0;
						}

						if (semantics.matches("\\d+")) {

							// if the semantics field is a number, then build the integer index out of it
							index = Integer.parseInt(semantics) - 1;

						} else
						// catch (NumberFormatException e)
						{ // if it is not a number set it to the first entry

							index = 0;

						}

						// If there are no files in the directory correspond to a search line in
						// the config file

						class filenameFilter implements FilenameFilter {
							@Override
							public boolean accept(File f, String s) {
								return new File(f, s).isFile() && s.endsWith(fileSuffix);
							}
						}

						// TODO: Maybe implement a better solution
						FilenameFilter currentFilter = new filenameFilter();

						// List of all gridfiles
						File[] files = userdir.listFiles(currentFilter);

						if (files.length < 1) {

							// If there are no files matching, continue with the next MD

							continue outerloop;
						}

						/*
						 * Search for a specific key here and save the line to an RDD data structure.
						 * Done with the filter function
						 * 
						 */

						JavaRDD<String> MDLines = metadataFiles.get(segsMD[1]).filter(new Function<String, Boolean>() {
							public Boolean call(String x) {

								// Check the line with Parsing functionality with RegEx possibilities
								// TODO: Since solutions may be quite slow, implement faster one

								Pattern r = Pattern.compile(searchKey, Pattern.CASE_INSENSITIVE);
								Scanner scaLine = new Scanner(x.trim());

								if (scaLine.findInLine(r) != null) {
									scaLine.close();
									return true;
								} else {
									scaLine.close();
									return false;
								}

							}
						});

						// trim all the stuff so no leading spaces suck around
						MDLines = MDLines.map(s -> s.trim());

						// this if clause is needed because when the delimiter is a whitespace
						// and the search key contains multiple words separated by a space,
						// parsing won't work. So this if-clause replaces all the search key by
						// a paceholding character without spaces, so the delimiter works
						if (segsMD[3].equals("space")) {

							MDLines = MDLines.map(s -> s.replaceFirst(searchKey, "xxx"));

						}

						MDLines = MDLines.distinct();

						// Mapping to a Key,Value pair might be simulation code dependent
						// this is handled by some if branches that are needed
						if ((((MDKey.contains("nodes")) || MDKey.contains("ppn"))) && !MDLines.isEmpty()) {
							// TODO: Implement a better cut function.

							// One that is done by Spark stuff/Mapping and can used on RDDs
							List<String> myList = MDLines.collect();

							String[] nodesArr = new String[myList.size()];
							nodesArr = myList.toArray(nodesArr);

							final String cutNodes = ExtractIng.cutNodesPpn(nodesArr[0], MDKey);

							JavaRDD<String> nodesRDD = sc.parallelize(Arrays.asList(MDKey)).cache();

							JavaPairRDD<String, String> MDKVtmp = nodesRDD.mapToPair(s -> new Tuple2<>(s, cutNodes));

							// if the MDkey does not exist yes in MD, create it and create an empty HashMap
							MD.putIfAbsent(MDKey, new HashMap<Integer, String>());

							JavaRDD<String> value = MDKVtmp.map(tuple -> tuple._2());

							String foo = "";
							if (value != null && !value.isEmpty()) {
								foo = value.first().trim();

								MD.get(MDKey).put(index, foo);
							}

						}

						else {
							/*
							 * here comes the GENERIC PROCESSING: Just use the filtered RDD, Use the mapper
							 * function and bring it to key, value form
							 */
							if (searchKey.equals("line")) {

								// Do line parsing here
								class gridFilenameFilter implements FilenameFilter {
									@Override
									public boolean accept(File f, String s) {
										return new File(f, s).isFile() && s.endsWith(fileSuffix);
									}
								}

								FilenameFilter gridFilter = new gridFilenameFilter();

								// List of all gridfiles
								File[] gridFiles = userdir.listFiles(gridFilter);

								// // create a one-dimensional RDD as a starting point
								JavaRDD<String> grid = sc.parallelize(Arrays.asList(MDKey));

								if (delim.equals("tail")) {

									// // Use map function to map the result line/last line of gro-File, which was
									// // processed by the tail method
									// // as the value and the MDKey as the key in dey key,value pair

									JavaPairRDD<String, String> MDKVtmp = grid
											.mapToPair(s -> new Tuple2<>(s, ExtractIng.tail(gridFiles[0])));

									// if the MDkey does not exist yes in MD, create it and create an empty HashMap
									MD.putIfAbsent(MDKey, new HashMap<Integer, String>());

									JavaRDD<String> value = MDKVtmp.map(tuple -> tuple._2());

									String foo = "";
									if (value != null && !value.isEmpty()) {
										foo = value.first().trim();

										MD.get(MDKey).put(index, foo);
									}

								} else {

									// // Use map function to map the result line/last line of gro-File, which was
									// // processed by the tail method
									// // as the value and the MDKey as the key in dey key,value pair
									JavaPairRDD<String, String> MDKVtmp = grid.mapToPair(s -> new Tuple2<>(s,
											ExtractIng.readLn(gridFiles[0], Integer.parseInt(delim))));

									// if the MDkey does not exist yes in MD, create it and create an empty HashMap
									MD.putIfAbsent(MDKey, new HashMap<Integer, String>());

									JavaRDD<String> value = MDKVtmp.map(tuple -> tuple._2());

									String foo = "";
									if (value != null && !value.isEmpty()) {
										foo = value.first().trim();

										MD.get(MDKey).put(index, foo);
									}

									// MDKV = MDKV.union(MDKVtmp);

								}

							} else {
								////////////////////////////////////////////////////////////////
								// GENERIC PARSING without special cases is done here
								// Do key,value parsing here
								//////////////////////////////////////////////////////////////

								// Generic Mapper function that is based on the metadata key and the delimiter
								PairFunction<String, String, String> mapper = new PairFunction<String, String, String>() {
									public Tuple2<String, String> call(String x) {

										if (x.split(delim).length > 1) {

											// if a fixed Metadata/EngMeta key should be harvested
											//return new Tuple2<String, String>(MDKey, x.split(delim)[1]);
											x = ExtractIng.cutExtraChar(x, delim, finalExtraChar);
											return new Tuple2<String, String>(MDKey, x);
											
										} else {

											// if a fixed Metadata/EngMeta key should be harvested
											return new Tuple2<String, String>(MDKey, x.split(delim)[0]);

										}

									}

								};

								// TODO: Check what is the optimal parameter for the coalesce operation
								MDLines.coalesce(1);

								// TODO: Maybe handle ambigious Search keys

								// Here the result of the actual run is stored (MDkey, Value)
								JavaPairRDD<String, String> MDKVtmp = MDLines.mapToPair(mapper);

								// if the MDkey does not exist yet in MD, create it and create an empty HashMap
								MD.putIfAbsent(MDKey, new HashMap<Integer, String>());

								JavaRDD<String> value = MDKVtmp.map(tuple -> tuple._2());

								String foo = "";
								if (value != null && !value.isEmpty()) {
									foo = value.first().trim();

									MD.get(MDKey).put(index, foo);
								}

							}

						}

					}
				}

			}
			sca.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		//////////////////////////////////////////////////////////////////////////////
		//
		// Parsing of the explicit and implicit File Metadata in expFileMD
		//
		///////////////////////////////////////////////////////////////////////////////

		/*
		 * 
		 * Get the filename with the path DONE: Writing to output file does not work
		 * here: Possible reason: based on an empty RDD This was solved by first
		 * creating an array, then transforming this array to an RDD.
		 */

		for (int i = 0; i < dataFiles.length; i++) {

			String fileName = inputDir + dataFiles[i];
	
			// Create a List with one entry as the starting point
			// from the array, create a one-dimensional RDD (all done in one expression so
			// no extra variable is needed
			JavaRDD<String> fileNameRDD = sc.parallelize(Arrays.asList("storage"));
	
			// map the one dimensional RDD to a two-dimensional RDD to comply with the
			// key,value representation we need
			JavaPairRDD<String, String> fileNameKV = fileNameRDD.mapToPair(s -> new Tuple2<>(s, fileName));
	
			//MDKV = MDKV.union(fileNameKV);
	
			/*
			 * 
			 * Check the file size
			 * 
			 */
	
			long size = dataFiles[i].length();
	
			// Create a List with one entry as the starting point
			// TODO: maybe implement is an array with multiple entries since there might be
			// more than one data file
			// from the array, create a one-dimensional RDD (all done in one expression so
			// no extra variable is needed
			JavaRDD<String> sizeRDD = sc.parallelize(Arrays.asList("size"));
	
			// map the one dimensional RDD to a two-dimensional RDD to comply with the
			// key,value representation we need
			JavaPairRDD<String, String> sizeKV = sizeRDD.mapToPair(s -> new Tuple2<>(s, Long.toString(size)));
	
			//MDKV = MDKV.union(sizeKV);
	
			// Do checksumming only if it is enabled in the config file
			if (checksum) {
				/*
				 * 
				 * Calculate the checksum
				 * 
				 */
	
				// Use MD5 algorithm
				MessageDigest md5Digest = MessageDigest.getInstance("MD5");
	
				// Get the checksum
				String checksum = fileChecksum(md5Digest, dataFiles[i]);
	
				// see checksum
				if (DEBUG)
					System.out.println(checksum);
	
				// Create a List with one entry as the starting point
				// from the array, create a one-dimensional RDD (all done in one expression so
				// no extra variable is needed
				JavaRDD<String> checksumRDD = sc.parallelize(Arrays.asList("checksum"));
	
				// map the one dimensional RDD to a two-dimensional RDD to comply with the
				// key,value representation we need
				JavaPairRDD<String, String> checksumKV = checksumRDD.mapToPair(s -> new Tuple2<>(s, checksum));
	
				//MDKV = MDKV.union(checksumKV);
	
			}
		}
		
		// Stop the Spark context
		// (Otherwise resrouces would leak)
		sc.stop();
		sc.close();

		// Return the extracted metadata
		return MD;

	}

}
