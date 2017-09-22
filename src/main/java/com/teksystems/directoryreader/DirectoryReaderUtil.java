package com.teksystems.directoryreader;

import java.io.File;
import java.util.logging.Logger;

/**
 * The purpose of this utility is to read and print all the file names under
 * parent directory and all it's subdirectories recursively. The project is
 * working code based on Maven and Java 8. The candidates are supposed to
 * re-factor this utility using good OO principles e.g. Single responsibility
 * principle, interface segregation and code readability. Besides this proper
 * exception handling should also be implemented when make sense. All the code
 * should be and must be backed by unit testing. Note: the code can be imported
 * and run in any ide, but when candidates submit the code, they are supposed to
 * take all the ide specific code out and submit the project as a zip file with
 * candidate first name and last name as the file name. To run: mvn package and
 * then mvn exec:java
 *
 * @author rjilani
 */
public class DirectoryReaderUtil {

	private static int lenghtOfDirectory ;
	private static final Logger LOGGER = Logger.getLogger(DisplayFiles.class.getName());
	public DirectoryReaderUtil(){}

	public int getLenghtOfDirectory() {
		return lenghtOfDirectory;
	}
	/**
	 * Main driver and entry point
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			File rootDirectory = new File("./testdirectory/Main Project");
			int directoryFileLength = rootDirectory.getAbsolutePath().length() - rootDirectory.getName().length();
			lenghtOfDirectory=directoryFileLength;
			new IterateFiles().listAllFilesRecursively(rootDirectory, 0);
		} catch (Exception ae) {
			LOGGER.info(ae.getMessage());
		}

	}
}
