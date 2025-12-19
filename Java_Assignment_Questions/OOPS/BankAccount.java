package Java_Assignment_Questions.OOPS;
/*Variables: accountNumber, holderName, balance
•     Constructor to initialize data
•     Method showAccount() prints details. Concepts: Object initialization
 */
public class BankAccount {
    long accountNumber;
    String holderName;
    float balance;

    BankAccount(){
        this.accountNumber=0001;
        this.holderName="Manish";
        this.balance=100000.0f;
    }

    public void showAccount(){
        System.out.println("Account Number :"+accountNumber);
        System.out.println("Holder Name :"+holderName);
        System.out.println("Balance :"+balance);

    }

    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
        ba.showAccount();
    }
    
    
}
