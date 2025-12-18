package Java_Assignment_Questions.Section_4;
import java.util.Scanner;
public class TwentySix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter element to be searched:");
        int el=sc.nextInt();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==el)
                System.out.println("Element found at index: "+i);
        }
    }
}
