package Java_Assignment_Questions.ExceptionHandling;

public class Assignment10 {
    public static void main(String[] args) {
        try {
            processData();
        } catch (ArithmeticException e) {
            // Requirement: Both log and exception handling should occur [cite: 91]
            System.out.println("Main method handling re-thrown exception: " + e.getMessage());
        }
    }

    public static void processData() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Requirement: Log a message [cite: 86]
            System.out.println("Log: Arithmetic error occurred in processData.");
            
            // Requirement: Rethrow using throw [cite: 88]
            throw e; 
        }
    }
}
