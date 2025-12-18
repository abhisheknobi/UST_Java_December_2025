import java.util.Scanner;

public class Nineteen {
    public static void main(String[] args) {
        int first=0;
        int second=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms for Fibonacci series:");
        int n=sc.nextInt();
        System.out.print(first+" "+second+" ");
        for(int i=3;i<=n;i++){
            int next=first+second;
            System.out.print(next+" ");
            first=second;
            second=next;
        }
        
    }
}

//0 1 1 2 3 5 8
