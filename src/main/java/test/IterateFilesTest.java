package test;

import com.teksystems.directoryreader.IterateFiles;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;


public class IterateFilesTest {

    private IterateFiles iterateFiles;
    @Before
    public void setUp() throws Exception {
        iterateFiles=new IterateFiles();
    }

    @After
    public void tearDown() throws Exception {
        iterateFiles=null;
    }

    @Test
    public void testCreateObjectOfIterateFiles()
    {
        assertNotNull(iterateFiles);
    }


}