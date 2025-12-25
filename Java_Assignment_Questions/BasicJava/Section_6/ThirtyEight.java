package Java_Assignment_Questions.Section_6;

import java.util.Scanner;

public class ThirtyEight {
    static float res(int p,float r,int t){
        return (p*r*t)/100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p=sc.nextInt();
        float r=sc.nextFloat();
        int t=sc.nextInt();
        System.out.println(res(p,r,t));

    
}
    
}
