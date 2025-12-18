import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        int area=l*b;
        System.out.println("Area of rectangle is: "+area);
        int per=2*(l+b);
        System.out.println("Perimeter of rectangle is: "+per);
    }
}
