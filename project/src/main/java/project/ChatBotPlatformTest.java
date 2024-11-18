package project;

import java.io.File;

public class ChatBotPlatformTest implements TestStrategy {
    private static final String EXPECTED_FILES[] = {"ChatBotPlatform.java"};

    @Override
    public TestResult runTest(ChatBot bot) {
        TestResult result = new TestResult();
        ChatBotPlatform platform = new ChatBotPlatform();

        platform.addChatBot(1);  
        platform.addChatBot(2);  
        platform.addChatBot(3);  

        String extractedDir = "output_dir";
        File file = new File(extractedDir, EXPECTED_FILES[0]);

        if (file.exists() &&
            platform.getChatBotList().stream().anyMatch(b -> b.getLLMCode() == 1) &&
            platform.getChatBotList().stream().anyMatch(b -> b.getLLMCode() == 2)) {
            
            result.setSuccess(true);
            result.setMessage("ChatBotPlatform management test passed. Required file was found.");
            result.setMarks(20);
        } else {
            result.setSuccess(false);
            result.setMessage("ChatBotPlatform management test failed. Required file is missing.");
            result.setMarks(0);
        }

        return result;
    }
}

    

