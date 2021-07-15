package ui;

import java.io.IOException;				// IOExpection Class import
import java.nio.file.DirectoryStream;	// DirectoryStream Class import
import java.nio.file.Files;				// Files Class import
import java.nio.file.Paths;				// Paths Class import
import java.nio.file.Path;				// Path Class import

public class FileIOApp {

	public static void main(String[] args) throws IOException {		// throws IOException to satisfy file creation.
		
		String dirString = "/Users/matt/temp/subfolder2";	// Mac String JAVA automatically starts at Macintosh HD. Use '/' eg. /Users/matt/new (absolute) vs Users/matt/new (relative) 
		// String dirString = "/repos/temp/subfolder2";		// Windows String JAVA automatically starts at C:/. Use '/' eg. /repos/new (absolute) vs repos/new (relative)
		Path dirPath = Paths.get(dirString);		// <-- New Directory PATH (contains full [directory] AND [file] path) :: Absolute location!
		
		if (Files.notExists(dirPath)) {				// If Files Class method notExist() returns TRUE, 
			Files.createDirectories(dirPath);		// create [Directory] in [dirPath] (absolute location)
			System.out.println("Directories created.");
		}
		
		// Create file if it doesn't exist
		String fileString = "items.txt";					// Using String to hold value of text file name to be created
		Path filePath = Paths.get(dirString, fileString);	// <-- New File PATH (contains full [directory] AND [file] path) :: Absolute location!
		
		if (Files.notExists(filePath)) {		// If Files Class method notExist() returns TRUE, 
			Files.createFile(filePath);			// create [File] in [filePath] (absolute location)
			System.out.println("File Created!");
		}
		
		// Create file using relative path
		fileString = "test-file.txt";			// <-- New File STRING
		filePath = Paths.get(fileString);		// <-- New File PATH :: Does NOT contain DIRECTORY Path :: Relative location!
		 if (Files.notExists(filePath)) {		// If Files Class method notExist() returns TRUE, 
			 Files.createFile(filePath);		// create [File] in [filePath] (relative location)
			 System.out.println("File Created!!");
		 }
		 
		 // Info about a file
		 System.out.println("File name: " + filePath.getFileName());			// returns file name of current filePath variable
		 System.out.println("Absolute Path: " + filePath.toAbsolutePath());		// returns the Absolute Path of the filePath variable
		 System.out.println("Is Writable: " + Files.isWritable(filePath));		// boolean expression test of 'Read-Only' (output)

		 
		 // Display files in a directory
		 if (Files.exists(dirPath) && Files.isDirectory(dirPath)) {						// If dirPath variable exist and dirPath exist AS directory,
			 System.out.println("Directory: " + dirPath.toAbsolutePath());				// output of dirPath variable AS absolute path
			 System.out.println("Files: ");
			 DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath);		// <-- NEW DirectoryStream of Type <Path> object creation, AND assignment of dirPath
			 for (Path p : dirStream) {													// enhanced for loop : for each p object of Class Path :  refer to DirectoryStream object dirStream
				 if (Files.isRegularFile(p)) {											// If current for loop iteration of Path p isRegularFile() == true
					 System.out.println("    " + p.getFileName());						// output of file name for current iteration of for loop.
				 }
			 }
			 
		 }
		

	}

}
