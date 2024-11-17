package project;

public class ChatBot {
    private String chatBotName;
    private int numResponsesGenerated;
    static final int messageLimit = 10;
    static int messageNumber = 0;
    private int LLMCode;
   


    public ChatBot() {
        this.LLMCode = 1;
        this.chatBotName = ChatBotGenerator.generateChatBotLLM(this.LLMCode);
    }
   
    public ChatBot(int LLMCode) {
        this.LLMCode = LLMCode;
        this.chatBotName = ChatBotGenerator.generateChatBotLLM(LLMCode);
    }

    
    public String getName() {
        return this.chatBotName;
    }

    public int getLLMCode(){
        return this.LLMCode;
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
