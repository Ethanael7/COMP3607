package project;
//import java.io.File;
//import java.io.IOException;
//import java.util.Arrays;

public class FileExtractorTest {
    /*  public static void main(String[] args) {
        
        TestData testData = new TestData(
            "Check Java Files",
            Arrays.asList("invalid.java", "missing.java"), 
            Arrays.asList("Student1.java", "Student2.java") 
        );

        
        String zipFilePath = "path_to_zip_file.zip"; 
        String outputDirectory = "output_dir"; 

        try {
            
            FileExtractor.extractZip(zipFilePath, outputDirectory);

            System.out.println("Testing boundary values...");
            for (String expectedFile : testData.getBoundaryValues()) {
                File file = new File(outputDirectory + File.separator + expectedFile);
                if (file.exists()) {
                    System.out.println("PASS: File " + expectedFile + " extracted successfully.");
                } else {
                    System.out.println("FAIL: File " + expectedFile + " not found.");
                }
            }

            
            System.out.println("\nTesting invalid inputs...");
            for (String invalidFile : testData.getInvalidInputs()) {
                File file = new File(outputDirectory + File.separator + invalidFile);
                if (file.exists()) {
                    System.out.println("FAIL: Unexpected file found: " + invalidFile);
                } else {
                    System.out.println("PASS: No invalid file found for " + invalidFile + ".");
                }
            }

        } catch (IOException e) {
            System.out.println("Error extracting files: " + e.getMessage());
        }
    }*/
}
