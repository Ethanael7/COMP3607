package project;


public class ChatBotPlatformTest implements TestStrategy {

    @Override
    public TestResult runTest(ChatBot bot) {
        TestResult result = new TestResult();
        ChatBotPlatform platform = new ChatBotPlatform();


        ChatBot bot1 = new ChatBot(1, "LLaMa");
        ChatBot bot2 = new ChatBot(2, "Mistral7B");
        ChatBot bot3 = new ChatBot(3, "GPT-3");

        platform.addChatBot(bot1);  
        platform.addChatBot(bot2);  
        platform.addChatBot(bot3);  

        
        if (platform.getChatBotList().stream().anyMatch(b -> b.getName().equals("LLaMa")) &&
            platform.getChatBotList().stream().anyMatch(b -> b.getName().equals("Mistral7B"))) {
            result.setSuccess(true);
            result.setMessage("ChatBotPlatform management test passed.");
            result.setMarks(20);  
        } else {
            result.setSuccess(false);
            result.setMessage("ChatBotPlatform management test failed.");
            result.setMarks(0);   
        }

        return result;
    }
}

    

