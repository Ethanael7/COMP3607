package project;

public class ChatBotGenerator {
    // Generate ChatBot based on LLM Code
    public static String generateChatBotLLM(int LLMCode) {
        switch (LLMCode) {
            case 1: return "LLaMa";
            case 2: return "Mistral7B";
            case 3: return "Bard";
            case 4: return "Claude";
            case 5: return "Solar";
            default: return "ChatGPT-3.5"; // Default LLM
        }
    }
}
