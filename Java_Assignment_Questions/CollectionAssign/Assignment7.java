package Java_Assignment_Questions.CollectionAssign;

import java.util.HashSet;

public class Assignment7 {
    public static void main(String[] args) {
        // Store 5 colors in a HashSet [cite: 55]
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("Colors in HashSet:");
        // Display them using for-each loop [cite: 57]
        for (String color : colors) {
            System.out.println(color); // Order is not important [cite: 59]
        }
    }
}
