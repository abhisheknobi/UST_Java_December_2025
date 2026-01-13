package Java_Assignment_Questions.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Assignment1_WriteCSV {
    public static void main(String[] args) {
        // Assignment 1: Write Data to CSV File
        // Condition: Use FileWriter
        
        String filePath = "students.csv";
        
        try (FileWriter writer = new FileWriter(filePath)) {
            // Writing Header
            writer.append("id, name, marks\n");
            
            // Writing Sample Data
            writer.append("101, Ravi, 78\n");
            writer.append("102, Anita, 85\n");
            writer.append("103, Sunil, 35\n");
            writer.append("104, Priya, 92\n");
            writer.append("105, Aman, 45\n");
            
            System.out.println("Assignment 1: students.csv created successfully.");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
