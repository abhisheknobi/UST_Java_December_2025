package Java_Assignment_Questions.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment4 {
    public static void run(String filePath) {
        System.out.println("\n--- Assignment 4: Count Records ---");
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine(); // Ignore header
            while (br.readLine() != null) {
                count++;
            }
            System.out.println("Total number of students: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}