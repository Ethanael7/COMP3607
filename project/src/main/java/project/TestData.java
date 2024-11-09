package project;
import java.util.List;

public class TestData {
    private String expectedOutput;
    private List<String> invalidInputs;
    private List<String> boundaryValues;

    public TestData(String expectedOutput, List<String> invalidInputs, List<String> boundaryValues) {
        this.expectedOutput = expectedOutput;
        this.invalidInputs = invalidInputs;
        this.boundaryValues = boundaryValues;
    }

    public String getExpectedOutput() {
        return expectedOutput;
    }

    public List<String> getInvalidInputs() {
        return invalidInputs;
    }

    public List<String> getBoundaryValues() {
        return boundaryValues;
    }
}

    

