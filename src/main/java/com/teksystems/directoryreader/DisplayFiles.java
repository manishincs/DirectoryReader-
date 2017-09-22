package com.teksystems.directoryreader;
import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DisplayFiles implements IDisplayFiles {
    private static final String DELIMETER = File.separator + ".";
    private static final Logger LOGGER = Logger.getLogger(DisplayFiles.class.getName());
    /**
     * Iterate directory and sub directory
     *
     * @param sortedListOfFiles
     * @param tabs
     * @param dir
     */
    public void iterateListOfFiles(List<String> sortedListOfFiles, int tabs, File dir) {
        IterateFiles iterateFiles=  new IterateFiles();
        DisplayFiles displayFiles= new DisplayFiles();
        try{
            for (String item : sortedListOfFiles) {
            tabs++;
            File file = new File(dir + "/" + item);
            if (file.isDirectory()) {
                iterateFiles.listAllFilesRecursively(file, tabs);
                tabs--;
            } else {
                displayFiles.printFileOnconsole(file, tabs);
                tabs--;
            }
        }}catch(Exception ae){
            LOGGER.info(ae.getMessage());
        }

    }

    /**
     * This method prints directory and files on console
     *
     * @param file
     * @param tabs
     */
    public void printFileOnconsole(File file, int tabs) {
        try
        {
        String fileName = file.getName();
        String[] split = fileName.split(DELIMETER);
        for (int i = 0; i < tabs; i++) {
            System.out.print("  ");
        }
            System.out.print("- Document: " + file.getName() + " - Extension: ." + split[split.length - 1] + " - URL: "
                + file.getAbsolutePath().substring(new DirectoryReaderUtil().getLenghtOfDirectory()));
        }catch(Exception ae){
            LOGGER.info(ae.getMessage());
        }
    }
}
