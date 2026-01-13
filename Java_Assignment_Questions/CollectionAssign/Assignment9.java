package Java_Assignment_Questions.CollectionAssign;

import java.util.HashMap;
import java.util.Map;

public class Assignment9 {
    public static void main(String[] args) {
        // Store 3 country codes and country names in a HashMap [cite: 71]
        HashMap<String, String> countries = new HashMap<>();
        countries.put("US", "United States");
        countries.put("IN", "India");
        countries.put("UK", "United Kingdom");

        System.out.println("Country List:");
        // Use entrySet() (or keySet()) to print all keys and values [cite: 73, 75]
        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println("Code: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}