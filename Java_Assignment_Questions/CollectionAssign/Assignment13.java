package Java_Assignment_Questions.CollectionAssign;

import java.util.ArrayList;

public class Assignment13 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // Add elements to an ArrayList [cite: 103]
        list.add("Data 1");
        list.add("Data 2");

        System.out.println("List before clear: " + list);

        // Remove all elements using clear() method 
        list.clear();

        // List should be empty [cite: 107]
        System.out.println("List after clear: " + list);
    }
}
