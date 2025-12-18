package Java_Assignment_Questions.Section_6;

import java.util.Scanner;

public class ThirtyFour {
    static String check(int n){
        if(n%2==0)
            return "Even";
        else
            return "Odd";
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        System.out.println(check(n));
    }
}
