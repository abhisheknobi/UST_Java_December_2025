package Java_Assignment_Questions.CollectionAssign;

import java.util.ArrayList;

public class Assignment14 {
    public static void main(String[] args) {
        // Store integer values using wrapper class (Integer) 
        ArrayList<Integer> numbers = new ArrayList<>();

        // Autoboxing automatically converts int to Integer wrapper
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);

        // Values stored and printed successfully [cite: 115]
        System.out.println("Wrapper Class Values: " + numbers);
    }
}