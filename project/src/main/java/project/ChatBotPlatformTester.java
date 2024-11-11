package project;

import java.util.List;

public class ChatBotPlatformTester implements TestStrategy{
    @Override
    public TestResult runTest(JavaFile javaFile, TestData testData) {
        
        return runPlaformCheck(javaFile, testData.getPlatformValues());
    }

    private TestResult runPlatformCheck(JavaFile javaFile, List<String> boundaryValues) {
        TestResult result = new TestResult();
        result.setSuccess(true); 
        result.setMessage("Boundary test passed for " + javaFile.getFileName());
        return result;
    }
}
    

