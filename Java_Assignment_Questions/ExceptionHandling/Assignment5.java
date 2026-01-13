package Java_Assignment_Questions.ExceptionHandling;

public class Assignment5 {
    public static void main(String[] args) {
        System.out.println("Opening file...");
        
        try {
            // Requirement: Simulate file handling logic [cite: 44]
            System.out.println("Reading file data...");
            // Simulating an error during file processing
            throw new RuntimeException("File corrupted"); 
            
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
            
        } finally {
            // Requirement: Ensure resource is closed; finally always executes [cite: 41, 46]
            System.out.println("Closing file resource (finally block executed).");
        }
    }
}