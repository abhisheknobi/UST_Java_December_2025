package Java_Assignment_Questions.CollectionAssign;
import java.util.HashSet;

public class Assignment6 {
    public static void main(String[] args) {
        // Create a HashSet [cite: 46]
        HashSet<Integer> numbers = new HashSet<>();

        // Add duplicate values [cite: 46, 49]
        numbers.add(10);
        numbers.add(20);
        numbers.add(10); // Duplicate
        numbers.add(30);
        numbers.add(20); // Duplicate

        // Expected Outcome: Duplicates should not be stored [cite: 51]
        System.out.println("HashSet Elements (Unique only): " + numbers);
    }
}
