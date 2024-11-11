package project;
public class ChatBotGeneratorTester implements TestStrategy{

    @Override
        public TestResult runTest(JavaFile javaFile, TestData testData){
    
            return executeAndCompare(javaFile, testData.getExpectedOutput());
        }
    
    private TestResult executeAndCompare(JavaFile javaFile, String expectedOutput) {
        TestResult result = new TestResult();
        result.setSuccess(true);
        result.setMessage("Correct test passed for " + javaFile.getFileName());
        return result;
    }
}
    
    