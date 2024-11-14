package project;

public class ChatBot {
    private String chatBotName;
    private int numResponsesGenerated;
    private static final int messageLimit = 10;  
    private static int messageNumber = 0;        

    
    public ChatBot() {
        this.chatBotName = ChatBotGenerator.generateChatBotLLM(0);  
        this.numResponsesGenerated = 0;
    }

    
    public ChatBot(int LLMCode) {
        this.chatBotName = ChatBotGenerator.generateChatBotLLM(LLMCode);
        this.numResponsesGenerated = 0;
    }

    
    public String getChatBotName() {
        return chatBotName;
    }

    
    public int getNumResponsesGenerated() {
        return numResponsesGenerated;
    }

    
    public static int getMessageNumber() {
        return messageNumber;
    }

    
    public static int getTotalNumMessagesRemaining() {
        return messageLimit - messageNumber;
    }

   
    public static boolean limitReached() {
        return messageNumber >= messageLimit;
    }

   
    private String generateResponse() {
        if (!limitReached()) {
            numResponsesGenerated++;
            messageNumber++;
            return "Message " + messageNumber + " from " + chatBotName;
        } else {
            return "Daily Limit Reached. Wait 24 hours to resume chatbot usage.";
        }
    }

    
    public String prompt(String requestMessage) {
        return generateResponse();
    }

    @Override
    public String toString() {
        return "ChatBot Name: " + chatBotName + ", Responses Generated: " + numResponsesGenerated;
    }
}
