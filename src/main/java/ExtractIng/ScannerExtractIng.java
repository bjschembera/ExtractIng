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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import java.util.regex.Pattern;

/**
 * This class implements parsing of metadata in a native approach using the Java
 * Scanner API. Scanner is quite comfortable however a little slower than
 * BufferedReaders.
 *  
 * @author Bjoern Schembera
 *
 */

public class ScannerExtractIng extends ExtractIng {

	/**
	 * 
	 * This is the central method of this class and implements the native parsing
	 * approach. Scanner API is used here. The method gets 3 strings: confFile
	 * contains the path to the configuration file, inputDir holds the directory
	 * containing the files to parse.
	 * 
	 * The method once loops through the configuration file. For each entry (of the
	 * structure | metadata key, file, search key, delimiter/line number, semantics
	 * |) it opens the file and scans through the file until the search key is found
	 * /the line number is reached. Then, it extracts the information by cutting at
	 * the delimiter, and saves it to the data structure MD. After looping through
	 * the file, MD is filled with all the found metadata and is returned
	 * 
	 * @param confFile
	 *            The configuration file
	 * @param inputDir
	 *            The directory where the data to parse is found
	 * @return The extracted information in the nested HashMap
	 * @throws Exception
	 */

	public Map<String, HashMap<Integer, String>> parse(String confFile, String inputDir) throws Exception {

		// Config file is defined here
		File confFileObj = new File(confFile);

		// The directory to parse
		File userdir = new File(inputDir);

		// Description of the data files
		String dataSuffix = "foo";
		
		// Leading and Trailing Characters that should be cut
		String[] extraChar = {};

		/*
		 * 
		 * PREPERATORY LOOP THORUGH CONFIG FILE
		 * 
		 * One first loop through the config file.
		 * 
		 * This is needed to check for parameters: - code - checksumming - matching mode
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

				// split the line by = to get the file, code and additional information
				String[] segs = i.split(Pattern.quote("="));

				if (!i.startsWith("#")) { // only if not commented, process this line

					if (segs[0].equals("data")) {

						dataSuffix = segs[1];

					}

					// Only if checksumming is enabled in the config file, do it.
					if (segs[0].equals("checksum")) {

						if (segs[1].equals("yes")) {
							checksum = true;
						} else {
							checksum = false;
						}

					}
					
					// If there are leading and trailing characters defined in the config file
					if (segs[0].equals("char_to_cut")) {
						
						extraChar = segs[1].split(Pattern.quote(","));
						
						//If comma itself should be omitted, too, uncomment these lines:
						extraChar = Arrays.copyOf(extraChar, extraChar.length + 1);
						extraChar[extraChar.length - 1] = ",";
						
					}

					// In case of multiple search results, decide which one to take
					if (segs[0].equals("matching")) {

						if (segs[1].equals("first")) {
							matchingMode = "first";
						} else {
							matchingMode = "all";
						}

					}

				}

			}

			sca.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		final String finalDataSuffix = dataSuffix;

		// Helper function that gathers all the data files
		class dataFilenameFilter implements FilenameFilter {
			@Override
			public boolean accept(File f, String s) {
				return new File(f, s).isFile() && s.contains(finalDataSuffix);
			}
		}

		FilenameFilter dataFilter = new dataFilenameFilter();

		// List of all data Files/non-MD files
		File[] dataFiles = userdir.listFiles(dataFilter);

		if (dataFiles.length == 0) { // if there are no data files present, exit
			System.err.println("There are no data files in the specified directory... Exiting.");
			System.exit(1);
		}

		/*
		 * 
		 * MAIN PARSING LOOP
		 *
		 * Now do the real parsing of the config file Main program logic here: depending
		 * on what is found in the config file, parsing of all job, log, ... files is
		 * done here. With the outerloop, we loop through the config file. Only lines
		 * containing the parsing information (format: metadatakey, file, searchkey,
		 * delimiter, semantics/rank) are considered. Then, for each of the above lines,
		 * in the innerloop, the respective file, is opened for scanning parsing with
		 * regex patterns. If a line containing the search key is found, the line is
		 * then spilt according to the delimiter/line number. Then the result is moved
		 * to the HashMap data stucture "MD" containg all the key value metadata pairs.
		 * 
		 *
		 */
		try {

			Scanner sca = new Scanner(confFileObj);

			// outerloop is for looping through the config file
			outerloop: while (sca.hasNextLine()) {
				// Scan the config file line for line
				String i = sca.nextLine();
				
				// split the line by = to get the file, code and additional information
				String[] segs = i.split(Pattern.quote("="));

				if (!i.startsWith("#")) {

					// split the line by , to get the metadata information
					String[] segsMD = i.split(Pattern.quote(","));

					if (segsMD.length > 3) {
						// Check if there is a valid line in the config file

						// The variables that hold the information from the segsMD array:
						// [MDKey,fileSuffix,searchKey,delim,semantics/rank/index]

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

							// if not the loop can break
							// ??? needed ??
							// break outerloop;
						}

						// Array File[] now contains all the files belonging to one MDFile type
						// as defined in the config file
						File[] MDFiles = userdir.listFiles(new FilenameFilter() {
							@Override
							public boolean accept(File f, String s) {
								return new File(f, s).isFile() && s.endsWith(fileSuffix);
							}
						});

						if (MDFiles.length < 1) {
							// If there are no files matching, continue with the next MD

							continue outerloop;
						}
						
						// For development purposes: only take the first file of this type
						// TODO: implement it for more files. Has to be done in a loop

						File MDFile = MDFiles[0];

						String line = "foo";
						Scanner scaMDFile = new Scanner(MDFile);

						/*
						 * 
						 * Here are the two main cases for parsing: Should (a) just be a line be
						 * extracted/tailed or should (b) regular Key/values be searched and extracted?
						 * 
						 * 
						 */

						if (searchKey.equals("line")) {

							/*
							 * Case (a) do the line parsing
							 */

							if (delim.equals("tail")) {

								MD.putIfAbsent(MDKey, new HashMap<Integer, String>());

								// if not we take the index value to put it in the right place
								// within all the other values
								MD.get(MDKey).put(index, ExtractIng.tail(MDFile));

							} else {
								MD.putIfAbsent(MDKey, new HashMap<Integer, String>());

								MD.get(MDKey).put(index, ExtractIng.readLn(MDFile, Integer.parseInt(delim)));

							}

						} else {

							/*
							 * Case (b) do the regular key/value parsing here (This is the usual case)
							 */

							// loop through all the lines in the file that contains the metadata to harvest
							innerloop: while (scaMDFile.hasNextLine()) {

								line = scaMDFile.nextLine().trim();

								// start a line scanner
								Scanner scaLine = new Scanner(line);
								// make a pattern out of the search key
								Pattern r = Pattern.compile(searchKey, Pattern.CASE_INSENSITIVE);

								// Check the line with a RegEx
								if (scaLine.findInLine(r) != null) {

									// Mapping to a Key,Value pair might be simulation code dependent
									// this is handled by some if branches that are needed

									// This if clause is needed because when the delimiter is a whitespace
									// and the search key contains multiple words separated by a space,
									// parsing won't work. So this if-clause replaces all the search key by
									// a paceholding character without spaces, so the delimiter works
									if (segsMD[3].equals("space"))
										line = line.replaceFirst(searchKey, "xxx");

									if (!delim.equals("na")) {
										// this is the regular parsing case, where we just want to extract
										// information in the form of key - delimiter - value

										MD.putIfAbsent(MDKey, new HashMap<Integer, String>());

										if (!(MD.get(MDKey) == null) && line.split(delim).length > 1) {

											// if (!MD.get(MDKey).containsValue(line.split(delim)[1].trim())) { // make
											// search
											// results unique
											// TODO: think if it is useful to make search results unique??
											MD.putIfAbsent(MDKey, new HashMap<Integer, String>());

											//MD.get(MDKey).put(index, line.split(delim)[1].trim());
											MD.get(MDKey).put(index, ExtractIng.cutExtraChar(line, delim, extraChar));
											// }
										}

										// special case when we search for nodes or ppn
										if (((MDKey.contains("nodes")) || MDKey.contains("ppn"))) {
											MD.putIfAbsent(MDKey, new HashMap<Integer, String>());

											MD.get(MDKey).put(index, ExtractIng.cutNodesPpn(line, MDKey));

										}

									} else {
										// if there is no delimiter (this means "na" as search key), save the complete
										// line

										MD.putIfAbsent(MDKey, new HashMap<Integer, String>());

										MD.get(MDKey).put(index, line.trim());

									}

									// If matchingMode equals "first", only the FIRST occurence of
									// of the search key is found. Makes it way faster.

									if (matchingMode.equals("first"))
										break innerloop;
								}

								// close the Scanner for the inner loop
								scaLine.close();

							}

						}
						// close the scanner for the outer loop through the config file
						scaMDFile.close();

					}
				}

			}

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
			// Assemble the filename
			String fileName = inputDir + dataFiles[i];
			MD.putIfAbsent("storage", new HashMap<Integer,String>());
			MD.get("storage").put(i, fileName);
		
			/*
			 * 
			 * Check the file size
			 * 
			 */
	
			long size = dataFiles[i].length();
	
			MD.putIfAbsent("size", new HashMap<Integer,String>());
			MD.get("size").put(i,Long.toString(size));
			// MD.put("size", Long.toString(size));
	
	
			
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
				MD.putIfAbsent("checksum", new HashMap<Integer,String>());
				MD.get("checksum").put(i,checksum);
	
				// MD.put("checksum", checksum);
			}
		}

		return MD;

	}

}
