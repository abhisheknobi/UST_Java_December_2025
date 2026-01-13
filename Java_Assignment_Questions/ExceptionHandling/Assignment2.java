package Java_Assignment_Questions.ExceptionHandling;

public class Assignment2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Array of size 5
        
        try {
            // Requirement: Try to access an invalid index [cite: 14]
            int invalidAccess = numbers[10]; 
            System.out.println("Value: " + invalidAccess);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            // Requirement: Print "Invalid array index accessed" [cite: 17, 19]
            System.out.println("Invalid array index accessed.");
        }
    }
}