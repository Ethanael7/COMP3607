package project;

import java.util.ArrayList;
import java.util.List;

public class ChatBotPlatform {
    private ArrayList<ChatBot> bots;

    
    public ChatBotPlatform() {
        bots = new ArrayList<>();
    }

    public boolean addChatBot(int LLMCode) {
        if (getTotalNumMessagesRemaining() > 0) {
            ChatBot newBot = new ChatBot(LLMCode);
            bots.add(newBot);
            return true;
        }
        return false;  
    }

  
    public int getNumResponsesGenerated() {
        int totalResponses = 0;
        for (ChatBot bot : bots) {
            totalResponses += bot.getNumResponsesGenerated();
        }
        return totalResponses;
    }

 
    public int getTotalNumMessagesRemaining() {
        return ChatBot.messageLimit - ChatBot.messageNumber;
    }

    public boolean limitReached() {
        return ChatBot.messageNumber >= ChatBot.messageLimit;
    }


    public String prompt(String requestMessage) {
        if (limitReached()) {
            return "Daily Limit Reached. Wait 24 hours to resume chatbot usage";
        } else {
            return bots.get(0).generateResponse();  
        }
    }

    public List<ChatBot> getChatBotList() {
    return bots; 
    }
}



