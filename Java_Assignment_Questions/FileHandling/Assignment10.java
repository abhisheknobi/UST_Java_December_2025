package Java_Assignment_Questions.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment10 {
    public static void run(String filePath) {
        System.out.println("\n--- Assignment 10: Topper Details ---");
        String topperName = "";
        int maxMarks = -1;
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine(); // Skip header
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int currentMarks = Integer.parseInt(data[2].trim());
                
                if (currentMarks > maxMarks) {
                    maxMarks = currentMarks;
                    topperName = data[1];
                }
            }
            System.out.println("Topper: " + topperName + " with " + maxMarks + " marks.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}