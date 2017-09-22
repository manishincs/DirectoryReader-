package com.teksystems.directoryreader;

import java.io.File;
import java.util.List;


public interface IDisplayFiles {
    void iterateListOfFiles(List<String> sortedListOfFiles, int tabs, File dir);
    void printFileOnconsole(File file, int tabs);
}
