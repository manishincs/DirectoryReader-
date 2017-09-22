package com.teksystems.directoryreader;
import java.io.File;
import java.util.List;
import java.util.logging.Logger;

public class IterateFiles implements IIterateFiles {
    private static final Logger LOGGER = Logger.getLogger(DisplayFiles.class.getName());
    /**
     * This methods list and print all files recursively
     *
     * @param dir
     * @param tabs
     */
    public void listAllFilesRecursively(File dir, int tabs) {
        try {
            if (dir != null) {
                if (dir.isDirectory()) {
                    for (int i = 0; i < tabs; i++) {
                        System.out.print("  ");
                    }
                    System.out.println("- Project: " + dir.getName() + " - URL: "
                            + dir.getAbsolutePath().substring(new DirectoryReaderUtil().getLenghtOfDirectory()));
                    String listOfFileNames[] = dir.list();
                    // sortedList = sort(s);
                    List<String> sortedListOfFiles = new SortFiles().sortFilesByExtensions(listOfFileNames);
                    new DisplayFiles().iterateListOfFiles(sortedListOfFiles, tabs, dir);
                } else {
                    System.out.println("Please provide a path to root directory");
                }
            } else {
                System.out.println(dir + " is not a directory");
            }
        }catch(Exception ae){
            LOGGER.info(ae.getMessage());
        }
    }


}
