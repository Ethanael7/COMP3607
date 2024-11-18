package project;

import java.io.File;

public class ChatBotSimulationTest implements TestStrategy {
    
    private static final String EXPECTED_FILES[] = {"ChatBot.java", "ChatBotPlatform.java", "ChatBotGenerator.java"};
    @Override
    public TestResult runTest(ChatBot bot) {
        TestResult result = new TestResult();

        String extractedDir = "output_dir";
        boolean allFilesFound = true;
        StringBuilder missingFiles = new StringBuilder();
        

        for (String fileName : EXPECTED_FILES) {
            File file = new File(extractedDir, fileName);
            if (!file.exists()) {
                allFilesFound = false;
                missingFiles.append(fileName).append(", ");
            }
        }

        if (allFilesFound) {
            result.setSuccess(true);
            result.setMessage("ChatBot simulation test passed. All expected files were found.");
            result.setMarks(12);
        } else {
            result.setSuccess(false);
            result.setMessage("ChatBot simulation test failed. Missing files: " + missingFiles.toString());
            result.setMarks(0);
        }

        return result;
    }
}