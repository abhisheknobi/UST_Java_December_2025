package Java_Assignment_Questions.Encapsulation;

public class ATMAccount {
    private int pin;
    private float balance;

    public void setPin(int pin){
        int count=0;
        int temp=pin;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        if(count==4)
            this.pin=pin;
        else
            System.out.println("Invalid PIN. PIN must be 4 digits.");    
    }

    public float withdraw(int amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            return amount;
        }
        else{
            System.out.println("Insufficient balance or invalid amount.");
            return 0;
        }
    }

    public static void main(String[] args) {
        ATMAccount account=new ATMAccount();
        account.setPin(1234); // Valid PIN
        account.balance=5000.0f; // Direct access for demonstration
        System.out.println("Withdrawn Amount: "+account.withdraw(1500));
        System.out.println("Remaining Balance: "+account.balance);
        account.setPin(123); // Invalid PIN
        System.out.println("Withdrawn Amount: "+account.withdraw(6000)); // Exceeds balance
    }
}
