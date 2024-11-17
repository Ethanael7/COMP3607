
import org.junit.jupiter.api.Test;
import project.ChatBotGenerator;
import static org.junit.jupiter.api.Assertions.*;

public class ChatBotGeneratorTest {

    @Test
    public void testGenerateChatBotLLM() {
        int totalMarks = 7; 
        try {
            assertEquals("LLaMa", ChatBotGenerator.generateChatBotLLM(1), "LLMCode 1 should return 'LLaMa'");
            assertEquals("Mistral7B", ChatBotGenerator.generateChatBotLLM(2), "LLMCode 2 should return 'Mistral7B'");
            assertEquals("Bard", ChatBotGenerator.generateChatBotLLM(3), "LLMCode 3 should return 'Bard'");
            assertEquals("Claude", ChatBotGenerator.generateChatBotLLM(4), "LLMCode 4 should return 'Claude'");
            assertEquals("Solar", ChatBotGenerator.generateChatBotLLM(5), "LLMCode 5 should return 'Solar'");

            System.out.println("Test passed. Marks awarded: " + totalMarks);
        } catch (AssertionError e) {
            System.out.println("Test failed. Marks awarded: 0");
            throw e; 
        }
    }
}

