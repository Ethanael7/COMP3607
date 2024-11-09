package project;
import project.TestData;
import project.TestResult;
import project.TestSuite;

public class SubmissionHandler {
    private TestSuite testSuite;
    
    public SubmissionHandler(){
        this.testSuite = new TestSuite();
    }

    public void runAllTests(JavaFile javaFile, TestData testData){
        testSuite.setTestStrategy(new CorrectTest());
        TestResult correctTestResult = testSuite.p
    }
}
