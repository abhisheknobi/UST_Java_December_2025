package Java_Assignment_Questions.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment9 {
    public static void run(String filePath) {
        System.out.println("\n--- Assignment 9: Validate Data ---");
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine(); // Skip header
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                try {
                    if (data.length < 3) continue; 
                    int marks = Integer.parseInt(data[2].trim());
                    System.out.println("Valid Record: " + data[1] + " (" + marks + ")");
                } catch (NumberFormatException e) {
                    System.out.println("Skipping invalid record: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}