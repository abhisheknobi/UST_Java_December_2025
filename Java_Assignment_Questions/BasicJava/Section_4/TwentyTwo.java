package Java_Assignment_Questions.Section_4;

public class TwentyTwo {
    public static void main(String[] args) {
        int[] nums={10,20,30,40,50};
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        float avg=(float)sum/nums.length;
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+avg);
    }
}
