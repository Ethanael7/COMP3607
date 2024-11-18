package project;
import java.util.List;

class TestData {
    private final String testName;
    private final List<String> invalidInputs;
    private final List<String> boundaryValues;

    public TestData(String testName, List<String> invalidInputs, List<String> boundaryValues) {
        this.testName = testName;
        this.invalidInputs = invalidInputs;
        this.boundaryValues = boundaryValues;
    }

    public String getTestName() {
        return testName;
    }

    public List<String> getInvalidInputs() {
        return invalidInputs;
    }

    public List<String> getBoundaryValues() {
        return boundaryValues;
    }
}

    

