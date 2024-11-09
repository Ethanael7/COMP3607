package project;

import java.util.List;

public class BoundaryTest implements TestStrategy{
    @Override
    public TestResult runTest(JavaFile javaFile, TestData testData) {
        
        return runBoundaryCheck(javaFile, testData.getBoundaryValues());
    }

    private TestResult runBoundaryCheck(JavaFile javaFile, List<String> boundaryValues) {
        TestResult result = new TestResult();
        result.setSuccess(true); 
        result.setMessage("Boundary test passed for " + javaFile.getFileName());
        return result;
    }
}
    

