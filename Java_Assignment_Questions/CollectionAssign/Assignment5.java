package Java_Assignment_Questions.CollectionAssign;

import java.util.ArrayList;

public class Assignment5 {
    public static void main(String[] args) {
        // Create an ArrayList of fruits [cite: 38]
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");

        // Check whether "Apple" exists using contains() method 
        boolean exists = fruits.contains("Apple");

        // Print whether Apple is present or not [cite: 42]
        if (exists) {
            System.out.println("Apple is present.");
        } else {
            System.out.println("Apple is not present.");
        }
    }
}
