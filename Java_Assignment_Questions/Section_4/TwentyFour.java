package Java_Assignment_Questions.Section_4;

public class TwentyFour {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        int c1=0;
        int c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)
                c2++;
            else
                c1++;

        }
        System.out.println("Number of odd number is" +c1);
        
        System.out.println("Number of even number is" +c2);
    }
    
}
