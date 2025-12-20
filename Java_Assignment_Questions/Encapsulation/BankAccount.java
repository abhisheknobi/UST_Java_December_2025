package Java_Assignment_Questions.Encapsulation;
/*Private: accountNumber, balance
•     Setter validates balance (no negative value)
•     Getter returns balance.
 */
public class BankAccount {
    private long accountNumber;
    private float balance;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        if(balance<0)
            this.balance = 0;
        else
        this.balance = balance;
    }

    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
        ba.setAccountNumber(123456789);
        ba.setBalance(5000.0f);
        System.out.println("Account Number :"+ba.getAccountNumber());
        System.out.println("Balance :"+ba.getBalance());    
        BankAccount ba2=new BankAccount();
        ba2.setAccountNumber(987654321);
        ba2.setBalance(-100.0f); // This should trigger validation
        System.out.println("Account Number :"+ba2.getAccountNumber());
        System.out.println("Balance :"+ba2.getBalance());

    }
    
    
}
