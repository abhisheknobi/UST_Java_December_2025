package Java_Assignment_Questions.CollectionAssign;

import java.util.ArrayList;

public class Assignment3 {
    public static void main(String[] args) {
        // Create an ArrayList of city names [cite: 22]
        ArrayList<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");

        // Find how many cities are stored using size() method 
        int totalCities = cities.size();

        // Total number of cities displayed [cite: 26]
        System.out.println("Total number of cities: " + totalCities);
    }
}
