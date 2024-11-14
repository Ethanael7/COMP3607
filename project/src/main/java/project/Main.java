package project;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ChatBot bot = new ChatBot("ChatGPT-3.5");
        ChatBotPlatform platform = new ChatBotPlatform("TestPlatform");

        // Create an instance of SubmissionHandler
        SubmissionHandler submissionHandler = new SubmissionHandler();

        // Run all tests for ChatBot and ChatBotPlatform
        submissionHandler.runAllTests(bot, platform);
    }
}





