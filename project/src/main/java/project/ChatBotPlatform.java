package project;
import java.util.ArrayList;


import java.util.List;

public class ChatBotPlatform {

    private List<ChatBot> chatBots;

    public ChatBotPlatform() {
        chatBots = new ArrayList<>();
    }

    public void addChatBot(ChatBot bot) {
        chatBots.add(bot);
    }

    public List<ChatBot> getChatBotList() {
        return chatBots;
    }
}

