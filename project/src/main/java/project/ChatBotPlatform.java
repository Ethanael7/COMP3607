package project;
import java.util.ArrayList;

public class ChatBotPlatform {
    private ArrayList<ChatBot> bots;


    public ChatBotPlatform() {
        this.bots = new ArrayList<>();
    }

    
    public boolean addChatBot(int LLMCode) {
        if (!ChatBot.limitReached()) {
            ChatBot newBot = new ChatBot(LLMCode);
            bots.add(newBot);
            return true;
        }
        return false;  
    }


    public String interactWithBot(int botNumber, String message) {
        if (botNumber >= 0 && botNumber < bots.size()) {
            return bots.get(botNumber).prompt(message);
        } else {
            return "Incorrect Bot Number (" + botNumber + ") Selected. Try again.";
        }
    }

    
    public String getChatBotList() {
        StringBuilder sb = new StringBuilder();
        for (ChatBot bot : bots) {
            sb.append(bot.toString()).append("\n");
        }
        return sb.toString();
    }
}
