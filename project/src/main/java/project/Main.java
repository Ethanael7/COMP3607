package project;
public class Main {
    public static void main(String[] args) {
        ChatBotPlatform platform = new ChatBotPlatform();

        // Use LLMCode directly to add bots
        platform.addChatBot(1);  // ChatBot with ID 1
        platform.addChatBot(2);  // ChatBot with ID 2
        platform.addChatBot(3);  // ChatBot with ID 3

        // Assuming SubmissionHandler exists and is properly implemented
        SubmissionHandler submissionHandler = new SubmissionHandler();
        submissionHandler.runAllTests(new ChatBot(1), platform);

        submissionHandler.generateFeedbackReport("12345", "John Doe", "Assignment 1", submissionHandler.getFeedback(), submissionHandler.getTotalScore());
    }
}








