package Java_Assignment_Questions.CollectionAssign;

import java.util.ArrayList;

public class Assignment15 {
    public static void main(String[] args) {
        // Create an ArrayList of strings [cite: 119]
        ArrayList<String> list = new ArrayList<>();
        list.add("Alpha");
        list.add("Beta");
        list.add("Gamma");

        // Convert to array using toArray() 
        // Note: We pass an empty array of the correct type to ensure correct return type
        String[] array = list.toArray(new String[0]);

        System.out.println("Array Elements:");
        // Array elements printed [cite: 123]
        for (String s : array) {
            System.out.println(s);
        }
    }
}