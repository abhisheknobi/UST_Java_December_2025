package Java_Assignment_Questions.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment6 {
    public static void run(String filePath) {
        System.out.println("\n--- Assignment 6: Failed Students (< 40) ---");
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine(); // Skip header
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int marks = Integer.parseInt(data[2].trim());
                if (marks < 40) {
                    System.out.println(data[1] + " failed with " + marks + " marks.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}