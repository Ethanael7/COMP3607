package project;
public class TestSuite {
    private TestStrategy testStrategy;

    public void setTestStrategy(TestStrategy testStrategy){
        this.testStrategy = testStrategy;
    }

    public TestResult performTest(JavaFile javaFile, TestData testData){
        if(testStrategy != null){
            return testStrategy.runTest(javaFile, testData);
        }else{
            throw new IllegalStateException("No test Strategy set");
        }
    }
}
