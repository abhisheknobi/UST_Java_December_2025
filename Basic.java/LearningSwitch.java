import java.util.Scanner;
public class LearningSwitch {
    public static void main(String[] args) {
        System.out.println("Enter 1st number");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();
        System.out.println("Enter operation (+, -, *, /)");
        int op=sc.next().charAt(0);
        switch(op){
            case '+':
                System.out.println("Sum is : "+(a+b));
                break;
            case '-':
                System.out.println("Difference is : "+(a-b));
                break;
            case '*':
                System.out.println("Product is : "+(a*b));
                break;
            case '/':   
                System.out.println("Quotient is : "+(a/b));
                break;
            default:
                System.out.println("Enter valid operation");
        }

    }
    
}
