package project;


public class ChatBotPlatformTest implements TestStrategy {

    @Override
    public TestResult runTest(ChatBot bot) {
        TestResult result = new TestResult();
        ChatBotPlatform platform = new ChatBotPlatform();

        
        platform.addChatBot(1);  
        platform.addChatBot(2);  
        platform.addChatBot(3);  

       
        if (platform.getChatBotList().stream().anyMatch(b -> b.getLLMCode() == 1) &&
            platform.getChatBotList().stream().anyMatch(b -> b.getLLMCode() == 2)) {
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


    

