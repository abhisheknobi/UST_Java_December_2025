package Java_Assignment_Questions.CollectionAssign;

import java.util.LinkedList;

public class Assignment11 {
    public static void main(String[] args) {
        // Store 5 numbers using LinkedList [cite: 87]
        LinkedList<Integer> list = new LinkedList<>();

        // Use add() method [cite: 89]
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        System.out.println("LinkedList Elements:");
        // All elements printed [cite: 91]
        System.out.println(list);
    }
}