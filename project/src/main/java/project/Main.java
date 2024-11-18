package project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ChatBotPlatform platform = new ChatBotPlatform();

        Scanner scanner = new Scanner(System.in);
        System.out.print( "Enter student ID: ");
        String studentID = scanner.nextLine();

        System.out.print( "Enter student name: ");
        String name = scanner.nextLine();
     

        platform.addChatBot(1);  
        platform.addChatBot(2);  
        platform.addChatBot(3);  

        FileProcessor processor = new FileProcessor();
        processor.processFiles();

        SubmissionHandler submissionHandler = new SubmissionHandler();
        submissionHandler.runAllTests(new ChatBot(1), platform);

        

        submissionHandler.generateFeedbackReport(studentID, name, "Assignment 1", submissionHandler.getFeedback(), submissionHandler.getTotalScore());
        
    }
}








