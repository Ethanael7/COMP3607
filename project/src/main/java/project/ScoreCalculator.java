package project;
public class ScoreCalculator {

        public int calculateScore(TestResult... results) {
            int totalScore = 0;
    
            for (TestResult result : results) {
                if (result.isSuccess()) {
                    totalScore += 10;  
                }
            }
    
            return totalScore;
        }
    }
    
