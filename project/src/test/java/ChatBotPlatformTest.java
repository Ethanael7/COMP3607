import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import project.ChatBotPlatform;

public class ChatBotPlatformTest {

    @Test
    public void testAddChatBot() {
        ChatBotPlatform platform = new ChatBotPlatform();
        assertTrue(platform.addChatBot(1), "ChatBot should be added successfully");
    }

    @Test
    public void testLimitReached() {
        ChatBotPlatform platform = new ChatBotPlatform();
        platform.addChatBot(1);  // LLaMa
        platform.addChatBot(2);  // Mistral7B
        assertFalse(platform.limitReached(), "Limit should not be reached yet");
    }

    @Test
    public void testGetChatBotList() {
        ChatBotPlatform platform = new ChatBotPlatform();
        platform.addChatBot(1);
        platform.addChatBot(2);
        assertNotNull(platform.getChatBotList(), "ChatBot list should not be null");
    }
}


