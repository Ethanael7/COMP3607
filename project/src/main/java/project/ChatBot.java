package project;

public class ChatBot {

    @SuppressWarnings("unused")
    private int id;
    private String name;

    public ChatBot(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
