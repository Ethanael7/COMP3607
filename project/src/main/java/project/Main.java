package project;
public class Main {
    public static void main(String[] args) {
        ChatBotPlatform platform = new ChatBotPlatform();

     
        platform.addChatBot(1);  
        platform.addChatBot(2);  
        platform.addChatBot(3);  

        SubmissionHandler submissionHandler = new SubmissionHandler();
        submissionHandler.runAllTests(new ChatBot(1), platform);

        submissionHandler.generateFeedbackReport("12345", "John Doe", "Assignment 1", submissionHandler.getFeedback(), submissionHandler.getTotalScore());
    }
}








