package Java_Assignment_Questions.ExceptionHandling;

// Requirement: Use at least two custom exceptions [cite: 105]
class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String msg) { super(msg); }
}

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String msg) { super(msg); }
}

class ValidationService {
    public void validateUser(String username, String password) throws InvalidUsernameException, InvalidPasswordException {
        if (username == null || username.isEmpty()) {
            throw new InvalidUsernameException("Username cannot be empty.");
        }
        if (password.length() < 6) {
            throw new InvalidPasswordException("Password must be at least 6 characters long.");
        }
    }
}

public class Assignment12 {
    public static void main(String[] args) {
        ValidationService service = new ValidationService();
        
        // Test Case 1: Invalid Username
        try {
            service.validateUser("", "securePass123");
        } catch (InvalidUsernameException | InvalidPasswordException e) {
            // Requirement: Handle in controller/main class [cite: 106]
            System.out.println("Validation Error: " + e.getMessage());
        }

        // Test Case 2: Invalid Password
        try {
            service.validateUser("Abhishek", "123");
        } catch (InvalidUsernameException | InvalidPasswordException e) {
            // Requirement: Different error messages based on failure type [cite: 108]
            System.out.println("Validation Error: " + e.getMessage());
        }
    }
}