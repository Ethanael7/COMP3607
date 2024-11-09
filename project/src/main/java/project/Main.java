package project;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String zipFilePath = "StudentSubmission.zip";
        
        FileExtractor fileExtractor = new FileExtractor();
        
        fileExtractor.extractAndCheckJavaFiles(zipFilePath);
        
        JavaFile javaFile = new JavaFile("tempStudentSubmission.java"); // Use the extracted file
        TestData testData = new TestData(
            "Expected output", 
            List.of("Invalid input 1", "Invalid input 2"), 
            List.of("Boundary value 1", "Boundary value 2")
        );

        SubmissionHandler submissionHandler = new SubmissionHandler();
        submissionHandler.runAllTests(javaFile, testData);
    }
}

