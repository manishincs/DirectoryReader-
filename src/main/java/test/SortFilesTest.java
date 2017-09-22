package test;

import com.teksystems.directoryreader.SortFiles;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;


public class SortFilesTest {
    private SortFiles sortFiles;

    @Before
    public void setUp() throws Exception {
        sortFiles=new SortFiles();
    }

    @After
    public void tearDown() throws Exception {
        sortFiles=null;
    }

    @Test
    public void testCreateObjectOfSortFiles()
    {
        assertNotNull(sortFiles);
    }

    // Please check your function implementation ,your sorting is not working, so here my test case is not passed
    @Test
    public void sortFilesByExtensions() throws Exception {
        String[] listofFiles={"boy.txt","cow.docx","abc.rtr"};
        List<String> sortedFiles=sortFiles.sortFilesByExtensions(listofFiles);
        System.out.println(sortedFiles);
        String[]ouputFiles={"abc.rtr","boy.txt","cow.docx"};
        for(int i=0;i<ouputFiles.length;i++)
        {
            assertEquals(ouputFiles[i],sortedFiles.get(i));
        }
    }

    // check with invalid input
    @Test
    public void sortFilesByExtensionsWithInvalidInput() throws Exception {
        String[] listofFiles=null;
        List<String> sortedFiles=sortFiles.sortFilesByExtensions(listofFiles);
        assertEquals(null,sortedFiles);
    }

}