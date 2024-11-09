package project;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        JavaFile javaFile = new JavaFile("StudentSubmission.java");

        TestData testData = new TestData(
            "Expected output", 
            List.of("Invalid input 1", "Invalid input 2"), 
            List.of("Boundary value 1", "Boundary value 2")
        );

        SubmissionHandler submissionHandler = new SubmissionHandler();
        submissionHandler.runAllTests(javaFile, testData);
    }
}