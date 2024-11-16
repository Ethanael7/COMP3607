package project;

import java.io.*;
import java.util.zip.ZipFile;


public class FileExtractor {
    public static void extractZip(String zipFilePath, String outputDirectory) throws IOException {
        File zipFile = new File(zipFilePath);

        if (!zipFile.exists() || !zipFile.isFile()) {
            throw new IllegalArgumentException("Invalid ZIP file: " + zipFilePath);
        }

        File outputDir = new File(outputDirectory);
        if (!outputDir.exists()) {
            outputDir.mkdirs();
        }

        try (ZipFile zip = new ZipFile(zipFile)) {
            if (zip.stream().count() == 0) {
                throw new IllegalArgumentException("The ZIP file is empty.");
            }

            zip.stream().forEach(entry -> {
                if (!entry.isDirectory()) {
                    File newFile = new File(outputDirectory + File.separator + entry.getName());
                    File parentDir = newFile.getParentFile();
                    if (!parentDir.exists()) {
                        parentDir.mkdirs();  
                    }

                    try (InputStream inputStream = zip.getInputStream(entry);
                         OutputStream outputStream = new FileOutputStream(newFile)) {
                        inputStream.transferTo(outputStream);
                        System.out.println("Extracted: " + entry.getName());
                    } catch (IOException e) {
                        System.err.println("Error extracting file: " + entry.getName());
                        e.printStackTrace();
                    }
                }
            });
        } catch (IOException e) {
            System.err.println("Error reading ZIP file: " + zipFilePath);
            throw e; 
        }
    }
}



