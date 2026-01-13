package Java_Assignment_Questions.CollectionAssign;

import java.util.HashMap;

public class Assignment10 {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(1, "John");
        employees.put(2, "Jane");
        employees.put(3, "Doe");

        System.out.println("Before Removal: " + employees);

        // Remove one employee entry (key 2) using remove() method 
        employees.remove(2);

        // Remaining entries printed [cite: 83]
        System.out.println("After Removal: " + employees);
    }
}
