package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamExample {
    public static void main(String[] args) {
        String directory = "D:/Sample/";  // Specify the directory
        String sourceFile = directory + "input.txt";
        String destinationFile = directory + "output.txt";

        // Create the directory if it does not exist
        try {
            File dir = new File(directory);
            if (!dir.exists()) {
                dir.mkdirs();
                System.out.println("Directory created: " + directory);
            } else {
                System.out.println("Directory already exists: " + directory);
            }
        } catch (Exception e) {
            System.err.println("Error creating directory: " + e.getMessage());
            return;
        }

        // Ensure the source file exists by writing to it first
        try (FileOutputStream fos = new FileOutputStream(sourceFile)) {
            String content = "Hello, this is a message in the input file.";
            fos.write(content.getBytes());
            System.out.println("Written to file: " + sourceFile);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Writing to the destination file using FileOutputStream
        try (FileOutputStream fos = new FileOutputStream(destinationFile)) {
            String content = "Hello, world!";
            fos.write(content.getBytes());
            System.out.println("Written to file: " + destinationFile);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Reading from the source file using FileInputStream
        try (FileInputStream fis = new FileInputStream(sourceFile)) {
            int content;
            System.out.println("Reading from file: " + sourceFile);
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
            System.out.println();
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
