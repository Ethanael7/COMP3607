package project;

import java.util.List;

public class ScoreCalculator {
    public int calculateScore(List<TestResult> testResults) {
        int totalMarks = 0;
        for (TestResult result : testResults) {

            totalMarks += result.getMarks();
        }
        return totalMarks;
    }
}


    
