import java.util.Scanner;

public class Twenty {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int flag=1;
        System.out.println("Enter a number to check prime or not:");
        int n=sc.nextInt();
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag=0;
            }
        }
        if(flag==0){
            System.out.println("Not a prime number");
        }
        else
        System.out.println("Prime number");
    }
}
