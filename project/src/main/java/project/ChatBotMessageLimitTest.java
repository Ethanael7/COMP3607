package project;

public class ChatBotMessageLimitTest implements TestStrategy {
    public TestResult runTest(ChatBot bot) {
        TestResult result = new TestResult();

        for (int i = 0; i < ChatBot.getTotalNumMessagesRemaining(); i++) {
            bot.prompt("Message " + i);
        }

        String response = bot.prompt("Over Limit Test");
        if (response.equals("Daily Limit Reached. Wait 24 hours to resume chatbot usage")) {
            result.setSuccess(true);
            result.setMessage("ChatBot message limit test passed.");
        } else {
            result.setSuccess(false);
            result.setMessage("ChatBot message limit test failed.");
        }

        return result;
    }
    
}
