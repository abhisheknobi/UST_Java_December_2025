import java.util.Scanner;
public class Fourteen {
   public static void main(String[] args) {
        int fact=1;
        System.out.println("Enter a number to find factorial:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
        
    }
}
