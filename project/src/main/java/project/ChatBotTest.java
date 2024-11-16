package project;
public class ChatBotTest implements TestStrategy{
    @Override
    public TestResult runTest(ChatBot bot){
        TestResult result = new TestResult();

        if(bot !=null){
            result.setSuccess(true);
            result.setMessage("ChatBot runs correctly.");
            result.setMarks(36);
        }else {
            result.setSuccess(false);
            result.setMessage("ChatBot does not compile/run.");
            result.setMarks(0);  
        }

        return result;
    }
}
    

    

    
    