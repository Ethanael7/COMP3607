package project;

import java.io.File;
import java.util.zip.ZipFile;
import java.io.IOException;

public class FileExtractor {
    public static void extractZip(String zipFilePath, String outputDirectory) throws IOException {
        File zipFile = new File(zipFilePath);
        try (ZipFile zip = new ZipFile(zipFile)) {
            zip.stream().forEach(entry -> {
                try {
                    if (!entry.isDirectory()) {
                        File newFile = new File(outputDirectory + File.separator + entry.getName());
                        newFile.getParentFile().mkdirs(); // Create necessary directories
                        try (var inputStream = zip.getInputStream(entry);
                             var outputStream = new java.io.FileOutputStream(newFile)) {
                            inputStream.transferTo(outputStream);
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}


