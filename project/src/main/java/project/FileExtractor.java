package project;

import java.io.*;
import java.util.zip.*;
import java.util.*;

public class FileExtractor {

    public void extractAndCheckJavaFiles(String zipFilePath) {
        File zipFile = new File(zipFilePath);
        
        if (!zipFile.exists()) {
            System.out.println("Error: The file does not exist.");
            return;
        }
        
        if (!zipFilePath.endsWith(".zip")) {
            System.out.println("Error: The file is not a ZIP file.");
            return;
        }
        
        try (ZipFile zip = new ZipFile(zipFilePath)) {
            Enumeration<? extends ZipEntry> entries = zip.entries();
            boolean hasJavaFiles = false;
            
            while (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();
                
        
                if (entry.getName().endsWith(".java")) {
                    hasJavaFiles = true;
    
                    extractJavaFile(zip, entry);
                }
            }
            
            if (!hasJavaFiles) {
                System.out.println("Error: The ZIP file does not contain any Java files.");
            } else {
                System.out.println("Java files extracted successfully.");
            }
        } catch (IOException e) {
            System.out.println("Error: Unable to read the ZIP file. " + e.getMessage());
        }
    }

    private void extractJavaFile(ZipFile zip, ZipEntry entry) {
        try (InputStream javaFileStream = zip.getInputStream(entry)) {
            
            File tempFile = new File(entry.getName());
            try (FileOutputStream fos = new FileOutputStream(tempFile)) {
                byte[] buffer = new byte[1024];
                int length;
                while ((length = javaFileStream.read(buffer)) > 0) {
                    fos.write(buffer, 0, length);
                }
            }
            System.out.println("Extracted Java file: " + entry.getName());
        } catch (IOException e) {
            System.out.println("Error extracting Java file: " + entry.getName() + " - " + e.getMessage());
        }
    }
}
