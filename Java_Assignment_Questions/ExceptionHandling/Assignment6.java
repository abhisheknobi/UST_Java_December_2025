package Java_Assignment_Questions.ExceptionHandling;

public class Assignment6 {
    public static void main(String[] args) {
        // Outer try block [cite: 53]
        try {
            int[] arr = {10, 20, 30};
            
            // Inner try block for ArithmeticException [cite: 52]
            try {
                int num = 10;
                int den = 0;
                int result = num / den;
            } catch (ArithmeticException e) {
                System.out.println("Inner Catch: Division by zero handled.");
            }
            
            // Triggering outer exception (Array Index)
            System.out.println(arr[5]);
            
        } catch (Exception e) {
            // Outer catch generic exception [cite: 53]
            System.out.println("Outer Catch: Generic exception handled (" + e.getClass().getSimpleName() + ").");
        }
    }
}