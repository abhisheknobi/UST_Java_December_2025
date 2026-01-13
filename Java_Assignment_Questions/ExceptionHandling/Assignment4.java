package Java_Assignment_Questions.ExceptionHandling;
public class Assignment4 {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int a = 10;
            int b = 0;
            
            // Uncomment the line below to test ArrayIndexOutOfBoundsException
            // int val = numbers[5]; 
            
            // This will throw ArithmeticException
            int result = a / b;
            
        } catch (ArithmeticException e) {
            // Requirement: Specific message for Arithmetic Exception [cite: 35]
            System.out.println("Error: Cannot divide by zero.");
            
        } catch (ArrayIndexOutOfBoundsException e) {
            // Requirement: Specific message for Array Index Exception [cite: 35]
            System.out.println("Error: Array index is out of bounds.");
            
        } catch (Exception e) {
            System.out.println("Generic error occurred.");
        }
    }
}