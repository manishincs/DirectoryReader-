package com.teksystems.directoryreader;
import java.util.List;

public interface ISortFiles {
    List<String> sortFilesByExtensions(String[] listOfFileNames);
}
