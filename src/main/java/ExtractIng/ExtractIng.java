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


/*
 * ExtractIng is a tool for the automated metadata extraction. It was 
 * developed for the extraction of simulation code outputs in high performance
 * computing environments.
 * For further information please refer to 
 * https://github.com/bjschembera/ExtractIng
 */

package ExtractIng;

import java.lang.String;
import java.security.MessageDigest;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * This is the superclass for the metadata extractor. This class includes
 * methods that will be used by both of the implementations. The metadata
 * extraction is implemented in two subclasses then. The class ScannerHarvester
 * uses a native, linear approach while SparkHarvester uses a parallel approach
 * based on the Spark Data Analytics framework.
 * 
 * @author Bjoern Schembera
 *
 */

public class ExtractIng {

	/**
	 * The constant NUMBER_OF_MD
	 * 
	 * Defines the maximum number of metadata fields per metadata key
	 */
	protected static final Integer NUMBER_OF_MD = 10;

	protected static Boolean GROMACS = false;
	protected static Boolean EAS3 = false;
	protected static Boolean checksum = false;

	// This parameter defines which values should be taken if multiple occur in one
	// file
	protected static String matchingMode = "first";

	protected String scheduler = "PBS";

	protected static Boolean DEBUG = true;

	/**
	 * <b>Central data structure for the Metadata MD</b>
	 * <p>
	 * This is the central structure for for the metadata. It is a Map contain of
	 * the type <String, HashMap<Integer, String>>. The first dimension is the
	 * metadata key, the second is a list of the values for this particular metadata
	 * key, with the integer as the index. So, the structure is
	 * <p>
	 * ( (key_1, ((index_1, value_1), (index_2, value_2), ...), <br>
	 * (key_2, ((index_1, value_1), (index_2, value_2), ...), <br>
	 * (key_3, ((index_1, value_1), (index_2, value_2), ...), <br>
	 * ...<br>
	 * (key_n, ... (index_m, value_m)))<br>
	 * <p>
	 * representing the metadata information. Example:
	 * <p>
	 * <p>
	 * ( (contact.name, ((1, Mustermann), (2, ), (3, Schembera), ...), <br>
	 * (contact.email, ((1, muster@mann.de), (2, ) (3, schembera@hlrs.de), ...),
	 * <br>
	 * (key_3, ((index_1, value_1), (index_2, value_2), ...), <br>
	 * ...<br>
	 * (key_n, ... (index_m, value_m)))<br>
	 * 
	 * <p>
	 * The nested HashMap with the index variable is needed so that search results
	 * can be related to one another.<br>
	 * Additionally gaps are allowed, that means not all values have to be
	 * completely filled. <br>
	 * <p>
	 * Sample ouput of the data structure:
	 * <p>
	 * 
	 * contact.name: Mustermann, null, Schembera, null, null, null, null, null,
	 * null, null, <br>
	 * contact.email: muster@mann.de, null, schembera@hlrs.de, null, null, null,
	 * null, null, null, null, <br>
	 * 
	 * 
	 */

	Map<String, HashMap<Integer, String>> MD = new HashMap<String, HashMap<Integer, String>>();

	/**
	 * 
	 * Method that creates the checksum of a file.
	 * 
	 * @param md
	 *            The message digest, e.g. the hash method
	 * @param fileHandle
	 *            The file handle for the file for which the hash should be created
	 * @return The hash value of the file as a string
	 * @throws IOException
	 */

	public static String fileChecksum(MessageDigest md, File fileHandle) throws IOException {
		// Open the file as stream
		FileInputStream fis = new FileInputStream(fileHandle);

		// For reading the data in chunks
		byte[] byteArray = new byte[1024];
		int bytesCount = 0;

		// Read file data and update in message digest
		while ((bytesCount = fis.read(byteArray)) != -1) {
			md.update(byteArray, 0, bytesCount);
		}
		;

		fis.close();

		byte[] bytes = md.digest();

		StringBuilder hash = new StringBuilder();
		for (int i = 0; i < bytes.length; i++) {
			hash.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
		}

		// return hash
		return hash.toString();
	}

	/**
	 * Function that returns a specific line of a file. Therefore the method gets
	 * the file and the number of the line to parse. Then, it walks through the
	 * lines until it reaches the requested line number and just returns this line.
	 * 
	 * @param file
	 *            The file object
	 * @param lineNr
	 *            An integer representing the line number which should be read
	 * @return A string which contains the line of a text file on lineNr
	 */

	public static String readLn(File file, Integer lineNr) {

		if (!file.canRead() || !file.isFile())
			System.exit(0);

		String line = null;
		BufferedReader in = null;

		try {
			// Create a buffered reader for the file
			in = new BufferedReader(new FileReader(file));

			// Now read the file line by line until the lineNr
			for (int i = 0; i < lineNr; i++) {

				line = in.readLine();

				if (line == null)
					line = "Line " + lineNr + " does not contain a string";

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null)
				try {
					in.close();
				} catch (IOException e) {
				}
		}
		// return the line at the position lineNr
		return line;

	}

	/**
	 * Helper function that gives the very last line of a file . Needed for line
	 * parsing, especially for GROMACS
	 * 
	 * @param file
	 *            The file handle for the file to check.
	 * @return The last line of the file as a string
	 */
	public static String tail(File file) {
		RandomAccessFile fileHandler = null;
		try {
			// Open a Random Access File handler
			fileHandler = new RandomAccessFile(file, "r");
			long fileLength = fileHandler.length() - 1;
			StringBuilder sb = new StringBuilder();

			//
			for (long filePointer = fileLength; filePointer != -1; filePointer--) {
				fileHandler.seek(filePointer);
				int readByte = fileHandler.readByte();

				if (readByte == 0xA) {
					if (filePointer == fileLength) {
						continue;
					}
					break;

				} else if (readByte == 0xD) {
					if (filePointer == fileLength - 1) {
						continue;
					}
					break;
				}

				sb.append((char) readByte);
			}

			String lastLine = sb.reverse().toString();
			return lastLine;
		} catch (java.io.FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (java.io.IOException e) {
			e.printStackTrace();
			return null;
		} finally {
			if (fileHandler != null)
				try {
					fileHandler.close();
				} catch (IOException e) {
					/* ignore */
				}
		}
	}

	/**
	 * 
	 * Node/ppn cutting function for PBS.
	 * 
	 * In PBS a line that contains the nodes looks like this:<br>
	 * MSUB -l nodes=1:ppn=8
	 * 
	 * This string has to be cut according to what is needed
	 * 
	 * @param input
	 *            The input string
	 * @param key
	 *            The key that should be search, which is either "nodes" or "ppn"
	 * @return The value of the key
	 */

	public static String cutNodesPpn(String input, String key) {

		// First, cut by the spaces, so array looks like [MSUB,-l,nodes=1:ppn=8]
		String[] foo = input.split(" ");

		// array nodesPpn looks like [nodes=1:ppn=8]
		String[] nodesPpn = foo[2].split(":");

		if (key.contains("nodes")) { // if nodes are needed, take the first part of the array and split it

			String[] nodes = nodesPpn[0].split("=");

			return nodes[1];

		} else if (key.contains("ppn")) {
			// if ppn is needed, return the second part of the array
			String[] ppn = nodesPpn[1].split("=");

			return ppn[1];

		} else {
			return "error";
		}

	}
	
	/**
	 * Leading and Trailing Character cutting function
	 * It would be called in the regular key/value parsing here (the usual case)
	 * 
	 * TODO: This function does not work yet.
	 * 
	 * 
	 * @param input
	 * 		The file handle for the file to check.
	 * @param delimiter
	 * 		The file handle for the file to check.
	 * @param charToCut
	 * 		The file handle for the file to check.
	 * @return 
	 * 		The value of the key
	 */
	
	public static String cutExtraChar(String input, String delimiter, String[] charToCut) {
		
		// First, cut by the delimiter, so array looks like [creator.name,"Hamzeh Kraus"]
		String[] foo = input.split(delimiter);
		String value = foo[1];
		
		// Converting String array to List
		List list = Arrays.asList(charToCut);
		
		String fc = "";
		String lc = "";
		
		//Striping spaces around the value, but not in between
		value = value.trim();
		
		do {
			//Defining first and last char in variables and then convert them to String 
			char firstchar = value.charAt(0);
			fc = Character.toString(firstchar); 
			
			char lastchar = value.charAt(value.length() - 1);
			lc = Character.toString(lastchar);
			
			//checks if at the beginning is there a leading char
			  if (list.contains(fc)) {
				  value = value.substring(1);
			  }
	
			//checks if at the end is there a trailing char
			  if (list.contains(lc)) {
				  value = value.substring(0, value.length() - 1);
			  }
			  
			  char newfirstchar = value.charAt(0);
			  fc = Character.toString(newfirstchar);
			  
			  char newlastchar = value.charAt(value.length() - 1);
			  lc = Character.toString(newlastchar);

		}while (list.contains(fc) | list.contains(lc));
		return value;
		
	}

	/**
	 * The main method for the extractor. Checks the correctness of the arguments
	 * and then calls the respective methods. After this, the output methods are
	 * called.
	 * 
	 * @param args
	 * @throws Exception
	 */

	public static void main(String args[]) throws Exception {
		
		if (args.length == 0) {
			System.err.println("Please specify the parameters as explained above.");
			System.exit(1);
		}
	    

		File configFile = new File(args[0]).getAbsoluteFile();
		if (!configFile.exists() || configFile.isDirectory()) {
			System.err.println("Config File does not exist... Exiting.");
			System.err.println("Correct Syntax: ./fdm.sh -c \"<configFile>\" -p \"<path1> <path2> ...\" -m \"<scanner|spark>\"");
			System.exit(1);
		}
		
		for (int i = 1; i < args.length-1; i++) { 
			
			//these print lines are just for testing!
			System.out.println("###########################################################");
			System.out.println("Config file : "+ args[0]);
			System.out.println("Path is : "+ args[i]);
			System.out.println("Execution mode is : "+ args[args.length-1]);
			System.out.println("###########################################################");
			
			
	        
	        
	        
			File parseDir = new File(args[i]).getAbsoluteFile();
			if (!parseDir.isDirectory()) {
				System.err.println("No Directory to parse specified... Exiting.");
				System.err.println("Correct Syntax: ./fdm.sh -c \"<configFile>\" -p \"<path1> <path2> ...\" -m \"<scanner|spark>\"");
				System.exit(1);
			}

			if (args[args.length-1].equals("spark")) {
				SparkExtractIng ExtractIng = new SparkExtractIng();
	
				Map<String, HashMap<Integer, String>> MD2 = new HashMap<String, HashMap<Integer, String>>();
	
				OutputMD outputClass = new OutputMD();
	
				MD2 = ExtractIng.parse(args[0], args[i]);
				outputClass.EngMetaXML(MD2, args[i]);
				outputClass.DCTermsXML(MD2, args[i]);
				outputClass.FlatTxt(MD2, args[i]);
	
			} else if (args[args.length-1].equals("scanner")) {
				ScannerExtractIng ExtractIng = new ScannerExtractIng();
	
				Map<String, HashMap<Integer, String>> parseMD = new HashMap<String, HashMap<Integer, String>>();
	
				OutputMD outputClass = new OutputMD();
	
				parseMD = ExtractIng.parse(args[0], args[i]);
				outputClass.EngMetaXML(parseMD, args[i]);
				outputClass.DCTermsXML(parseMD, args[i]);
				outputClass.FlatTxt(parseMD, args[i]);
				// System.out.println("done");
			} else {
	
				System.err.println("Parsing method not known... Exiting.");
				System.err.println("Correct Syntax: ./fdm.sh -c \"<configFile>\" -p \"<path1> <path2> ...\" -m \"<scanner|spark>\"");
				System.exit(1);
			} 
		}
	}


}
