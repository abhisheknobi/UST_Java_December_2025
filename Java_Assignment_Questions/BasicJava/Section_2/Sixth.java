import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        if(n==0)
            System.out.println("Number is zero");
        else if(n>0)
            System.out.println("Number is positive");
        else
            System.out.println("Number is negative");
    }
    
}
