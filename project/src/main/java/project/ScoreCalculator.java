package project;

import java.util.List;

public class ScoreCalculator {
    public int calculateScore(List<TestResult> testResults) {
        int totalScore = 0;
        for (TestResult result : testResults) {
            if (result.isSuccess()) {
                totalScore += 10;  
            }
        }
        return totalScore;
    }
}

    
