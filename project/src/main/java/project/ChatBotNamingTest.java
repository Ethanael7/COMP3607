package project;
public class ChatBotNamingTest implements TestStrategy{

    @Override
    public TestResult runTest(ChatBot bot){
        TestResult result = new TestResult();
        String botName = bot.getChatBotName();
        if (botName.equals("ChatGPT-3.5") || botName.equals("LLaMa") || botName.equals("Mistral7B") || botName.equals("Bard") || botName.equals("Claude") || botName.equals("Solar")) {
            result.setSuccess(true);
            result.setMessage("ChatBot naming test passed.");
        } else {
            result.setSuccess(false);
            result.setMessage("ChatBot naming test failed.");
        }

        return result;
        
    }
}
    

    
    