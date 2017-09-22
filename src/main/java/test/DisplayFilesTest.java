package test;

import com.teksystems.directoryreader.DisplayFiles;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;


public class DisplayFilesTest {
    private DisplayFiles displayFiles;



    @Before
    public void setUp() throws Exception {
        displayFiles=new DisplayFiles();
    }

    @After
    public void tearDown() throws Exception {
        displayFiles=null;
    }

    @Test
    public void testCreateObjectOfDisplayFiles()
    {
        assertNotNull(displayFiles);
    }

}