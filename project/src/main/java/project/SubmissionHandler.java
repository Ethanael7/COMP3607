package project;


public class SubmissionHandler {
    private TestSuite testSuite;
    private ScoreCalculator scoreCalculator;
    
    public SubmissionHandler(){
        this.testSuite = new TestSuite();
        this.scoreCalculator = new ScoreCalculator();
    }

    public void runAllTests(JavaFile javaFile, TestData testData) {
        
        testSuite.setTestStrategy(new CorrectTest());
        TestResult correctnessResult = testSuite.performTest(javaFile, testData);
        System.out.println(correctnessResult.getMessage());

       
        testSuite.setTestStrategy(new ErrorHandlerTest());
        TestResult errorHandlingResult = testSuite.performTest(javaFile, testData);
        System.out.println(errorHandlingResult.getMessage());

        
        testSuite.setTestStrategy(new BoundaryTest());
        TestResult boundaryResult = testSuite.performTest(javaFile, testData);
        System.out.println(boundaryResult.getMessage());

        int totalScore = scoreCalculator.calculateScore(correctnessResult, errorHandlingResult, boundaryResult);
        System.out.println("Total Score: " + totalScore);

}
}
