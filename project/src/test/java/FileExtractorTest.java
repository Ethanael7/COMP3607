import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import project.FileExtractor;


import java.io.*;
import java.nio.file.*;
import java.util.zip.*;


public class FileExtractorTest {

    private File tempZipFile;
    private File tempOutputDir;

    @BeforeEach
    void setUp() throws IOException {
        
        tempZipFile = File.createTempFile("test", ".zip");
        tempOutputDir = Files.createTempDirectory("output").toFile();

        try (ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(tempZipFile))) {
     
            zipOut.putNextEntry(new ZipEntry("testFile.txt"));
            zipOut.write("Test content".getBytes());
            zipOut.closeEntry();

            zipOut.putNextEntry(new ZipEntry("testDir/"));
            zipOut.closeEntry();

           
            zipOut.putNextEntry(new ZipEntry("testDir/nestedFile.java"));
            zipOut.write("public class Nested {}".getBytes());
            zipOut.closeEntry();
        }
    }

    @AfterEach
    void tearDown() {
        
        tempZipFile.delete();
        deleteDirectory(tempOutputDir);
    }

    @Test
    void testExtractZipFile() throws IOException {
        FileExtractor fileExtractor = new FileExtractor();

      
        fileExtractor.extractZipFile(tempZipFile.getAbsolutePath(), tempOutputDir.getAbsolutePath());
      
        File extractedFile = new File(tempOutputDir, "testFile.txt");
        File extractedDir = new File(tempOutputDir, "testDir");
        File extractedNestedFile = new File(extractedDir, "nestedFile.java");

        assertTrue(extractedFile.exists(), "Extracted file should exist");
        assertTrue(extractedDir.exists() && extractedDir.isDirectory(), "Extracted directory should exist");
        assertTrue(extractedNestedFile.exists(), "Nested file should exist");

        assertEquals("Test content", Files.readString(extractedFile.toPath()), "Extracted file content mismatch");
        assertEquals("public class Nested {}", Files.readString(extractedNestedFile.toPath()), "Nested file content mismatch");
    }

    private void deleteDirectory(File directory) {
        File[] allContents = directory.listFiles();
        if (allContents != null) {
            for (File file : allContents) {
                deleteDirectory(file);
            }
        }
        directory.delete();
    }
}

