package Java_Assignment_Questions.ExceptionHandling;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();
            
            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();
            
            int result = numerator / denominator;
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            // Requirement: Display user-friendly message "Division by zero is not allowed" [cite: 8, 10]
            System.out.println("Division by zero is not allowed.");
        } finally {
            scanner.close();
        }
    }
}
