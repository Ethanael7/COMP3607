package project;

import java.io.File;

public class JavaFileValidator {

    public boolean validateJavaFiles(File folder) {
        File[] files = folder.listFiles();
        if (files == null) return false;

        for (File file : files) {
            if (file.isDirectory()) {
                if (!validateJavaFiles(file)) {
                    return false;
                }
            } else {
                if (!file.getName().endsWith(".java")) {
                    System.out.println("Invalid file found: " + file.getName());
                    return false;
                }
            }
        }
        return true;
    }
}
