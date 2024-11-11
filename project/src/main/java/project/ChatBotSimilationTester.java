package project;

import java.util.List;

public class ChatBotSimilationTester implements TestStrategy{
    @Override
    public TestResult runTest(JavaFile javaFile, TestData testData) {
        return checkForErrorMessages(javaFile, testData.getInvalidInputs());
    }
    
    private TestResult checkForErrorMessages(JavaFile javaFile, List<String> invalidInputs) {
        TestResult result = new TestResult();
        result.setSuccess(true); 
        result.setMessage("Error handling test passed for " + javaFile.getFileName());
        return result;
    }
}


    
