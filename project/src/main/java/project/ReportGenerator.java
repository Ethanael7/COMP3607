package project;
public class ReportGenerator {
    
    public void generateReport(String testName, int score) {
       
        System.out.println("Generating report...");
        System.out.println("Test Name: " + testName);
        System.out.println("Score: " + score);
        System.out.println("PDF Generated (simulated)");
    }

    public void generateSummaryReport(int totalChatBotScore, int totalPlatformScore) {
        System.out.println("Generating Summary Report...");
        System.out.println("Total ChatBot Score: " + totalChatBotScore);
        System.out.println("Total ChatBotPlatform Score: " + totalPlatformScore);
        System.out.println("PDF Generated (simulated)");
    }
}
