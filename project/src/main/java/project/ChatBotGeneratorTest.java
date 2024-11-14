package project;

public class ChatBotGeneratorTest implements TestStrategy{
    @Override
    public TestResult runTest(ChatBot bot) {
        TestResult result = new TestResult();

        if (ChatBotGenerator.generateChatBotLLM(1).equals("LLaMa") &&
            ChatBotGenerator.generateChatBotLLM(2).equals("Mistral7B") &&
            ChatBotGenerator.generateChatBotLLM(3).equals("Bard") &&
            ChatBotGenerator.generateChatBotLLM(4).equals("Claude") &&
            ChatBotGenerator.generateChatBotLLM(5).equals("Solar")) {

            result.setSuccess(true);
            result.setMessage("ChatBotGenerator passed all tests.");
        } else {
            result.setSuccess(false);
            result.setMessage("ChatBotGenerator failed.");
        }

        return result;
    }
}

    
