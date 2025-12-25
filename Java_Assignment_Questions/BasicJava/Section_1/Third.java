import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal amount:");
        int p=sc.nextInt();
        System.out.println("Enter rate of interest:");
        float r=sc.nextFloat();
        System.out.println("Enter time in years:");
        int t=sc.nextInt();
        float si=(p*r*t)/100;
        System.out.println("Simple Interest is: "+si);
    }
}
