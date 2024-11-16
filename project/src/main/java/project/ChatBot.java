package project;

public class ChatBot {
    private String chatBotName;
    private int numResponsesGenerated;
    static final int messageLimit = 10;
    static int messageNumber = 0;
   


    public ChatBot() {
        this.chatBotName = "ChatGPT-3.5";  // Default LLM
    }

   
    public ChatBot(int LLMCode) {
        this.chatBotName = ChatBotGenerator.generateChatBotLLM(LLMCode);
    }

    
    public String getName() {
        return this.chatBotName;
    }

    public int getLLMCode(){
        return this.getLLMCode();
    }

    
    public String generateResponse() {
        messageNumber++;
        numResponsesGenerated++;
        return "Response from " + chatBotName + ": Message " + messageNumber;
    }

    
    public int getNumResponsesGenerated() {
        return numResponsesGenerated;
    }

    @Override
    public String toString() {
        return "ChatBot: " + chatBotName + ", Responses: " + numResponsesGenerated;
    }
}
