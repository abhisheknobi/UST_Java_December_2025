package Java_Assignment_Questions.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment7 {
    public static void run(String filePath) {
        System.out.println("\n--- Assignment 7: Average Marks ---");
        double totalMarks = 0;
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine(); // Skip header
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                totalMarks += Integer.parseInt(data[2].trim());
                count++;
            }
            if (count > 0) {
                System.out.println("Average Marks: " + (totalMarks / count));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}