import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import project.ChatBot;
import project.ChatBotSimulationTest;
import project.TestResult;

public class ChatBotSimulationTestTest {

    @Test
    void testRunTest_Success() {
        
        ChatBot bot = new ChatBot(1);  
        ChatBotSimulationTest simulationTest = new ChatBotSimulationTest();

      
        TestResult result = simulationTest.runTest(bot);

        
        assertTrue(result.isSuccess());
        assertEquals("ChatBot simulation test passed.", result.getMessage());
        assertEquals(12, result.getMarks());
    }

    @Test
    void testRunTest_Failure() {
        
        ChatBot bot = new ChatBot(2);  
        ChatBotSimulationTest simulationTest = new ChatBotSimulationTest() {
            @Override
            public TestResult runTest(ChatBot bot) {
                TestResult result = new TestResult();
                boolean simulationSuccessful = false;  

                if (simulationSuccessful) {
                    result.setSuccess(true);
                    result.setMessage("ChatBot simulation test passed.");
                    result.setMarks(12);
                } else {
                    result.setSuccess(false);
                    result.setMessage("ChatBot simulation test failed.");
                    result.setMarks(0);
                }

                return result;
            }
        };

        TestResult result = simulationTest.runTest(bot);

        assertFalse(result.isSuccess());
        assertEquals("ChatBot simulation test failed.", result.getMessage());
        assertEquals(0, result.getMarks());
    }
}

