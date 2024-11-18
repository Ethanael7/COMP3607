package project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileProcessor {

    private FileExtractor zipFileExtractor;
    private JavaFileValidator javaFileValidator;

    public FileProcessor() {
        this.zipFileExtractor = new FileExtractor();
        this.javaFileValidator = new JavaFileValidator();
    }

    public void processFiles() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the path to your zip file: ");
            String zipFilePath = scanner.nextLine();
            System.out.print("Enter the destination directory to extract files: ");
            String destDir = scanner.nextLine();

            try {
                // Extract the zip file
                zipFileExtractor.extractZipFile(zipFilePath, destDir);
                System.out.println("Zip file extracted successfully!");

                // Validate Java files
                File folder = new File(destDir);
                if (!javaFileValidator.validateJavaFiles(folder)) {
                    System.out.println("Invalid files detected. Make sure all files are .java files.");
                    return;
                }

            } catch (IOException e) {
                System.out.println("An error occurred while processing the files: " + e.getMessage());
            }
        }
    }
}

