package project;

import java.io.File;

public class ChatBotGeneratorTest implements TestStrategy {
    private static final String EXPECTED_FILES[] = {"ChatBotGenerator.java"};

    @Override
    public TestResult runTest(ChatBot bot) {
        TestResult result = new TestResult();
        String extractedDir = "output_dir";
        File file = new File(extractedDir, EXPECTED_FILES[0]);

        if (file.exists() &&
            ChatBotGenerator.generateChatBotLLM(1).equals("LLaMa") &&
            ChatBotGenerator.generateChatBotLLM(2).equals("Mistral7B") &&
            ChatBotGenerator.generateChatBotLLM(3).equals("Bard") &&
            ChatBotGenerator.generateChatBotLLM(4).equals("Claude") &&
            ChatBotGenerator.generateChatBotLLM(5).equals("Solar")) {
            
            result.setSuccess(true);
            result.setMessage("ChatBotGenerator passed all tests. Required file was found.");
            result.setMarks(7);
        } else {
            result.setSuccess(false);
            result.setMessage("ChatBotGenerator failed. Required file is missing or tests failed.");
            result.setMarks(0);
        }

        return result;
    }
}


    
