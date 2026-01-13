package Java_Assignment_Questions.CollectionAssign;

import java.util.ArrayList;

public class Assignment4 {
    public static void main(String[] args) {
        // Store 5 course names in an ArrayList [cite: 30]
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("C++");
        courses.add("Web Dev");
        courses.add("Data Science");

        System.out.println("Course List:");
        // Display them using a for-each loop 
        for (String course : courses) {
            System.out.println(course); // All course names printed successfully [cite: 34]
        }
    }
}
