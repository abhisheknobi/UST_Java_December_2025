package Java_Assignment_Questions.ExceptionHandling;

// Requirement: Extend Exception [cite: 70]
class InvalidBalanceException extends Exception {
    public InvalidBalanceException(String message) {
        super(message);
    }
}

public class Assignment8 {
    public static void main(String[] args) {
        double balance = 500.00;
        double minBalance = 1000.00;
        
        try {
            checkBalance(balance, minBalance);
        } catch (InvalidBalanceException e) {
            // Requirement: Custom exception message should be displayed [cite: 73]
            System.out.println("Transaction Failed: " + e.getMessage());
        }
    }

    public static void checkBalance(double balance, double minBalance) throws InvalidBalanceException {
        // Requirement: Throw exception when balance < minimum balance [cite: 71]
        if (balance < minBalance) {
            throw new InvalidBalanceException("Current balance " + balance + " is below minimum requirement of " + minBalance);
        }
    }
}
