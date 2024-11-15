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

    public String getChatBotList() {
        StringBuilder sb = new StringBuilder();
        for (ChatBot bot : bots) {
            sb.append(bot.toString()).append("\n");
        }
        return sb.toString();
    }
}
