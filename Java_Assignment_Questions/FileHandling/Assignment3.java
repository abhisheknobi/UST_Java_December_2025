package Java_Assignment_Questions.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment3 {
    public static void run(String filePath) {
        System.out.println("\n--- Assignment 3: Marks > 60 ---");
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int marks = Integer.parseInt(data[2].trim());
                if (marks > 60) {
                    System.out.println(line);
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}