package Java_Assignment_Questions.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment8 {
    public static void run(String srcFile) {
        System.out.println("\n--- Assignment 8: Copying Passed Students ---");
        String destFile = "passed_students.csv";
        
        try (BufferedReader br = new BufferedReader(new FileReader(srcFile));
             FileWriter writer = new FileWriter(destFile)) {
            
            String header = br.readLine();
            writer.write(header + "\n");
            
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int marks = Integer.parseInt(data[2].trim());
                
                if (marks >= 50) {
                    writer.write(line + "\n");
                }
            }
            System.out.println("Passed students copied to " + destFile);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}