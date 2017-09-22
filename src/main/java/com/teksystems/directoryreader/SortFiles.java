package com.teksystems.directoryreader;
import java.io.File;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Logger;

public class SortFiles implements ISortFiles {
    private static final Logger LOGGER = Logger.getLogger(DisplayFiles.class.getName());
    private static final String DELIMETER = File.separator + ".";
    /**
     * This methods sort the list of files by extension
     *
     * @param listOfFileNames
     * @return
     */
    public List<String> sortFilesByExtensions(String[] listOfFileNames) {
        try
        {
        List<String> orginalList = new CopyOnWriteArrayList<>(Arrays.asList(listOfFileNames));
        Set<String> setOfuniqueExtension = new TreeSet<>();

        for (String item : listOfFileNames) {
            if (item.contains(".")) {
                String[] split = item.split(DELIMETER);
                String temp = "." + split[split.length - 1];
                setOfuniqueExtension.add(temp);
            }
        }

        List<String> finalListOfAllFiles = new LinkedList<>();
        setOfuniqueExtension.stream().forEach((s1) -> {
            for (int i = 0; i < orginalList.size(); i++) {

                if (orginalList.get(i).contains(s1)) {
                    finalListOfAllFiles.add(orginalList.get(i));
                    orginalList.remove(orginalList.get(i));
                    i--;
                }

            }
        });

        orginalList.stream().filter((s1) -> (!finalListOfAllFiles.contains(s1))).forEach((s1) -> {
            finalListOfAllFiles.add(s1);
        });
            return finalListOfAllFiles;
        }catch(Exception ae){
            LOGGER.info(ae.getMessage());
            return null;
        }

    }

}
