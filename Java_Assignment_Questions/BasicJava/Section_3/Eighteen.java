

import java.util.Scanner;
public class Eighteen {
    public static int rev(int x) {
        int rev = 0;
        int sign = x < 0 ? -1 : 1;
        x = Math.abs(x);

        while (x > 0) {
            int rem = x % 10;
            x /= 10;

            // Check for overflow before multiplying and adding
            if (rev > (Integer.MAX_VALUE - rem) / 10) {
                return 0; // Return 0 on overflow (LeetCode style)
            }

            rev = rev * 10 + rem;
        }

        return rev * sign;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=rev(n);
        if(n==r){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
