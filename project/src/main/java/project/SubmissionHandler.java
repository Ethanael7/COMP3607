package project;

import java.util.ArrayList;
import java.util.List;

public class SubmissionHandler {
    private ScoreCalculator scoreCalculator;
    private ReportGenerator reportGenerator;

    public SubmissionHandler() {
        this.scoreCalculator = new ScoreCalculator();
        this.reportGenerator = new ReportGenerator();
    }

    public void runAllTests(ChatBot bot, ChatBotPlatform platform) {
        
        List<TestResult> chatBotResults = runTests(bot, getChatBotTests());
        printTestResults(chatBotResults);

        List<TestResult> platformResults = runTests(platform, getPlatformTests());
        printTestResults(platformResults);

        int totalChatBotScore = scoreCalculator.calculateScore(chatBotResults);
        System.out.println("Total Score for ChatBot: " + totalChatBotScore);

        int totalPlatformScore = scoreCalculator.calculateScore(platformResults);
        System.out.println("Total Score for ChatBotPlatform: " + totalPlatformScore);

        generateReport(totalChatBotScore, totalPlatformScore);
    }

    // Method to get a list of ChatBot-specific test strategies
    private List<TestStrategy> getChatBotTests() {
        List<TestStrategy> tests = new ArrayList<>();
        tests.add(new ChatBotNamingTest());
        tests.add(new ChatBotMessageLimitTest());
        return tests;
    }

    // Method to get a list of ChatBotPlatform-specific test strategies
    private List<TestStrategy> getPlatformTests() {
        List<TestStrategy> tests = new ArrayList<>();
        tests.add(new ChatBotPlatformTest());  // Add your platform-specific tests here
        return tests;
    }

    // General method to run a list of tests
    private List<TestResult> runTests(Object subject, List<TestStrategy> strategies) {
        List<TestResult> results = new ArrayList<>();
        for (TestStrategy strategy : strategies) {
            if (subject instanceof ChatBot) {
                results.add(strategy.runTest((ChatBot) subject));
            } else if (subject instanceof ChatBotPlatform) {
                results.add(strategy.runTest((ChatBot) subject));
            }
        }
        return results;
    }

    private void printTestResults(List<TestResult> testResults) {
        for (TestResult result : testResults) {
            System.out.println(result.getMessage());
        }
    }

    private void generateReport(int totalChatBotScore, int totalPlatformScore) {
        reportGenerator.generateSummaryReport(totalChatBotScore, totalPlatformScore);
    }
}

