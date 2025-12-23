package Java_Assignment_Questions.Inheritance;

public class SavingAccount extends Bank {
    
    public float calculateInterest(){
        float res=10000 * interestRate / 100;
        return res;
    }

    public static void main(String[] args) {
        SavingAccount sa=new SavingAccount();
        float interest=sa.calculateInterest();
        System.out.println("Interest on saving account for principal 10000: " + interest);
    }
    
}
