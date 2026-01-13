package Java_Assignment_Questions.ExceptionHandling;

public class Assignment9 {
    public static void main(String[] args) {
        try {
            // Requirement: Handle exception in main method [cite: 80]
            methodA();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    }

    // Requirement: Use throws keyword [cite: 79]
    public static void methodA() throws ClassNotFoundException {
        methodB();
    }

    public static void methodB() throws ClassNotFoundException {
        // Exception occurs here and propagates to A, then to Main [cite: 77, 82]
        throw new ClassNotFoundException("Simulated ClassNotFoundException");
    }
}
