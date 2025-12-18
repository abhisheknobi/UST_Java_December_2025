package Java_Assignment_Questions.Section_6;

import java.util.Scanner;

public class ThirtySeven {
    static int check(int n,int m){
        if(n>m)
            return n;
        else
            return m;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m=scanner.nextInt();
        System.out.println(check(n,m));
    }
    
}
