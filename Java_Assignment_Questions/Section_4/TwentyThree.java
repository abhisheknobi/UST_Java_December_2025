package Java_Assignment_Questions.Section_4;

public class TwentyThree {
    public static void main(String[] args) {
        int[] nums={40,50,10,20,30};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max)
                max=nums[i];
            if(nums[i]<min)
                min=nums[i];
        }
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);
        
    }
    
}
