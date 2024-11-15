package project;


public class Main {
    public static void main(String[] args) {
        
        ChatBot bot = new ChatBot(1);
        ChatBotPlatform platform = new ChatBotPlatform();

        platform.addChatBot(1);
        platform.addChatBot(2);
        SubmissionHandler submissionHandler = new SubmissionHandler();
        submissionHandler.runAllTests(bot, platform);
        submissionHandler.generateReport(10,1);

    }
}





