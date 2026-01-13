package Java_Assignment_Questions.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment2 {
    public static void run(String filePath) {
        System.out.println("\n--- Assignment 2: All Records ---");
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(","); 
                System.out.println("ID: " + data[0] + ", Name: " + data[1] + ", Marks: " + data[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}