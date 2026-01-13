package Java_Assignment_Questions.CollectionAssign;

import java.util.HashMap;

public class Assignment8 {
    public static void main(String[] args) {
        // Create a HashMap to store employee ID and employee name [cite: 63]
        HashMap<Integer, String> employees = new HashMap<>();

        // Use put() method [cite: 65]
        employees.put(101, "Alice Smith");
        employees.put(102, "Bob Jones");
        employees.put(103, "Charlie Day");

        // Use get() method to retrieve details [cite: 65]
        String empName = employees.get(101);

        // Employee details printed correctly [cite: 67]
        System.out.println("Employee ID 101: " + empName);
    }
}
