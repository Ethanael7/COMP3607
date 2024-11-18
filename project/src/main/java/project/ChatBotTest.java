package project;

import java.io.File;

public class ChatBotTest implements TestStrategy {
    private static final String EXPECTED_FILES[] = {"ChatBot.java"}; 

    @Override
    public TestResult runTest(ChatBot bot) {
        TestResult result = new TestResult();


        String extractedDir = "output_dir"; 

        
        for (String fileName : EXPECTED_FILES) {
            File file = new File(extractedDir, fileName);
            if (!file.exists()) {
                result.setSuccess(false);
                result.setMessage("Required file " + fileName + " is missing.");
                result.setMarks(0);
                return result;
            }
        }

        String expectedChatBotName = "ChatGPT-3.5"; 
        int expectedLLMCode = 1; 
        int expectedMessageLimit = 10;  

  
        if (bot != null) {
            
            if (bot.getName().equals(expectedChatBotName)) {
                result.setMarks(10); 
            } else {
                result.setMarks(0);
                result.setMessage("ChatBot name does not match the expected value.");
                return result;
            }

        
            if (bot.getLLMCode() == expectedLLMCode) {
                result.setMarks(5); 
            } else {
                result.setMarks(0);
                result.setMessage("ChatBot LLMCode does not match the expected value.");
                return result;
            }

           
            if (ChatBot.messageLimit == expectedMessageLimit) {
                result.setMarks(5); 
            } else {
                result.setMarks(0);
                result.setMessage("ChatBot messageLimit does not match the expected value.");
                return result;
            }

            
            String response = bot.generateResponse();
            if (response != null && response.contains("Response from " + bot.getName()) && response.contains("Message 1")) {
                result.setMarks(5); 
            } else {
                result.setMarks(0);
                result.setMessage("generateResponse() method did not work correctly.");
                return result;
            }

            // If all tests pass
            result.setSuccess(true);
            result.setMessage("ChatBot runs correctly, and all tests passed.");
            result.setMarks(36);
        } else {
            result.setSuccess(false);
            result.setMessage("ChatBot object is null.");
            result.setMarks(0);
        }

        return result;
    }
}

    

    

    
    