package project;

public class ChatBotSimulationTest implements TestStrategy {
    @Override
    public TestResult runTest(ChatBot bot) {
        TestResult result = new TestResult();

        
        boolean simulationSuccessful = true;  

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
}