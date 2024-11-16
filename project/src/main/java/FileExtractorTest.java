import java.io.File;
import java.io.IOException;
import project.FileExtractor;
import project.TestData;

import java.util.Arrays;

public class FileExtractorTest {
    public static void main(String[] args) {
        TestData testData = new TestData("Check Java Files", Arrays.asList("invalid.java", "missing.java"), Arrays.asList("Student1.java", "Student2.java"));
        
       
        String zipFilePath = "path_to_zip_file.zip";
        String outputDirectory = "output_dir";

        try {
            FileExtractor.extractZip(zipFilePath, outputDirectory);

            for (String expectedFile : testData.getBoundaryValues()) {
                File file = new File(outputDirectory + File.separator + expectedFile);
                if (file.exists()) {
                    System.out.println("File " + expectedFile + " extracted successfully.");
                } else {
                    System.out.println("File " + expectedFile + " not found in the extracted files.");
                }
            }

            
            for (String invalidFile : testData.getInvalidInputs()) {
                File file = new File(outputDirectory + File.separator + invalidFile);
                if (file.exists()) {
                    System.out.println("Unexpected file found: " + invalidFile);
                } else {
                    System.out.println("No invalid files found, as expected.");
                }
            }

        } catch (IOException e) {
            System.out.println("Error extracting files: " + e.getMessage());
        }
    }
}

