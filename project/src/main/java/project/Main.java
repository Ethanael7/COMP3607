package project;

public class Main {
    public static void main(String[] args) {
        
        
        ChatBot bot = new ChatBot(1, "LLaMa");
        ChatBotPlatform platform = new ChatBotPlatform();

 
        platform.addChatBot(new ChatBot(1, "LLaMa"));
        platform.addChatBot(new ChatBot(2, "Mistral7B"));
        platform.addChatBot(new ChatBot(3, "GPT-3"));

      
        SubmissionHandler submissionHandler = new SubmissionHandler();

        submissionHandler.runAllTests(bot, platform);

        

    }
}






