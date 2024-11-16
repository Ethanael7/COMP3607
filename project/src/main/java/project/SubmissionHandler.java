package project;

import java.util.Arrays;
import java.util.List;

public class SubmissionHandler {

    @SuppressWarnings("unused")
    private ScoreCalculator scoreCalculator;
    private ReportGenerator reportGenerator;
    int runs = 10;
    int compiles = 5;
    int passes = 10;

    public SubmissionHandler() {
        this.scoreCalculator = new ScoreCalculator();
        this.reportGenerator = new ReportGenerator();
    }

    public void runAllTests(ChatBot bot, ChatBotPlatform platform) {
        
        List<TestStrategy> chatBotTests = Arrays.asList(
            new ChatBotTest(), 
            new ChatBotGeneratorTest(), 
            new ChatBotSimulationTest()
        );

        
        int totalChatBotMarks = 0;
        for (TestStrategy test : chatBotTests) {
            TestResult result = test.runTest(bot);  
            System.out.println(result.getMessage());
            totalChatBotMarks += result.getMarks();
        }
        System.out.println("Total ChatBot Marks: " + totalChatBotMarks);

        
        int totalPlatformMarks = 0;
        TestStrategy platformTestStrategy = new ChatBotPlatformTest();  
        TestResult platformResult = platformTestStrategy.runTest(bot);  
        System.out.println(platformResult.getMessage());
        totalPlatformMarks += platformResult.getMarks();

        System.out.println("Total ChatBotPlatform Marks: " + totalPlatformMarks);

        int totalMark = (totalChatBotMarks + totalPlatformMarks) + runs + compiles + passes;

        System.out.println("Total Marks: " + totalMark);


    }


    void generateReport(int totalChatBotScore, int totalPlatformScore) {
        reportGenerator.generateSummaryReport(totalChatBotScore, totalPlatformScore);
    }

}



