package Java_Assignment_Questions.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment5 {
    public static void run(String filePath, String searchName) {
        System.out.println("\n--- Assignment 5: Search for '" + searchName + "' ---");
        boolean found = false;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[1].trim().equalsIgnoreCase(searchName)) {
                    System.out.println("Record Found: " + line);
                    found = true;
                }
            }
            if (!found) System.out.println("Student not found.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}