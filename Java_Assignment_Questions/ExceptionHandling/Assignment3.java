package Java_Assignment_Questions.ExceptionHandling;

public class Assignment3 {
    public static void main(String[] args) {
        // Requirement: Create a string variable with null value [cite: 23]
        String text = null;
        
        try {
            // Attempt to call a method on it [cite: 23]
            int length = text.length();
            System.out.println("Length: " + length);
            
        } catch (NullPointerException e) {
            // Requirement: Handle exception gracefully [cite: 28]
            System.out.println("Caught NullPointerException: Cannot invoke method on a null object.");
        }
    }
}