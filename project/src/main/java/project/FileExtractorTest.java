package project;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileExtractorTest {

    public static void main(String[] args) {
        
        TestData testData = new TestData(
            "Check Java Files",
            Arrays.asList("invalid.java", "missing.txt"), 
            Arrays.asList("Student1.java", "Student2.java") 
        );

       
        String zipFilePath = "path_to_test_zip_file.zip"; 
        String outputDirectory = "output_test_dir"; 

        try {
         
            FileExtractor fileExtractor = new FileExtractor();
            JavaFileValidator fileValidator = new JavaFileValidator();

            
            System.out.println("Extracting ZIP file...");
            fileExtractor.extractZipFile(zipFilePath, outputDirectory);

          
            System.out.println("\nTesting boundary values...");
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

           
            System.out.println("\nValidating Java files...");
            File outputDir = new File(outputDirectory);
            boolean validationResult = fileValidator.validateJavaFiles(outputDir);
            if (validationResult) {
                System.out.println("PASS: All extracted files are valid Java files.");
            } else {
                System.out.println("FAIL: Invalid files detected during validation.");
            }

        } catch (IOException e) {
            System.out.println("Error during testing: " + e.getMessage());
        } finally {
            
            deleteDirectory(new File(outputDirectory));
        }
    }

    
    private static void deleteDirectory(File directory) {
        File[] allContents = directory.listFiles();
        if (allContents != null) {
            for (File file : allContents) {
                deleteDirectory(file);
            }
        }
        directory.delete();
    }
}
