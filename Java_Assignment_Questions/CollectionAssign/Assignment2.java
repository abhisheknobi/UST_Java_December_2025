package Java_Assignment_Questions.CollectionAssign;

import java.util.ArrayList;

public class Assignment2 {
    public static void main(String[] args) {
        // Create an ArrayList of integers [cite: 13]
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add 5 numbers using add() [cite: 13, 15]
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original List: " + numbers);

        // Remove one number using remove() 
        numbers.remove(Integer.valueOf(30)); // Removes the object 30

        // Updated list displayed after removal [cite: 18]
        System.out.println("Updated List: " + numbers);
    }
}
