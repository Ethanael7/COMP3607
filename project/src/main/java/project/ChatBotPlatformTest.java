package project;

public class ChatBotPlatformTest implements TestStrategy{
    @Override
    public TestResult runTest(ChatBot bot) {
        TestResult result = new TestResult();
        ChatBotPlatform platform = new ChatBotPlatform();

        platform.addChatBot(1);  
        platform.addChatBot(2);  
        platform.addChatBot(3);  

        if (platform.getChatBotList().contains("LLaMa") && platform.getChatBotList().contains("Mistral7B")) {
            result.setSuccess(true);
            result.setMessage("ChatBotPlatform management test passed.");
        } else {
            result.setSuccess(false);
            result.setMessage("ChatBotPlatform management test failed.");
        }

        return result;
    }
}

    

