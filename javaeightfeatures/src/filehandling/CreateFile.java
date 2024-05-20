package filehandling;

import java.io.File;  
import java.io.FileWriter;
import java.io.IOException;   

public class CreateFile {
    public static void main(String args[]) {  
        try {  
            // Creating an object of a file  
            File f0 = new File("D:FileOperation.txt");   
            if (f0.createNewFile()) {  
                System.out.println("File " + f0.getName() + " is created successfully.");
                
                // Writing to the newly created file
                FileWriter writer = new FileWriter(f0);
                writer.write("Hello\n");
                writer.write("This file was created as part of a Java program.\n");
                writer.close();
                System.out.println("Successfully wrote to the file.");
            } else {  
                System.out.println("File already exists in the directory.");
                
                // Optional: Writing to the existing file (appending mode)
                FileWriter writer = new FileWriter(f0, true);
                writer.write("This message is appended to the existing file.\n");
                writer.close();
                System.out.println("Successfully appended to the file.");
            }  
        } catch (IOException exception) {  
            System.out.println("An unexpected error occurred.");  
            exception.printStackTrace();  
        }   
    }  
}
