package Java_Assignment_Questions.ExceptionHandling;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        try {
            validateAge(age);
            System.out.println("Age is valid. Access granted.");
        } catch (IllegalArgumentException e) {
            // Requirement: Handle exception properly [cite: 62]
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void validateAge(int age) {
        if (age < 18) {
            // Requirement: Throw exception if age < 18; Display "Age not eligible" [cite: 61, 64]
            throw new IllegalArgumentException("Age not eligible");
        }
    }
}