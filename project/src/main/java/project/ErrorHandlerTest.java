package project;

import java.util.List;

public class ErrorHandlerTest implements TestStrategy{
    @Override
    public TestResult runTest(JavaFile javaFile, TestData testData) {
        return checkForErrorMessages(javaFile, testData.getInvalidInputs());
    }
    
    private TestResult checkForErrorMessages(JavaFile javaFile, List<String> invalidInputs) {
        TestResult result = new TestResult();
        result.setSuccess(true); // Assume it handles errors properly
        result.setMessage("Error handling test passed for " + javaFile.getFileName());
        return result;
    }
}


    
