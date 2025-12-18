package Java_Assignment_Questions.Section_4;

public class TwentyFive {
    public static void main(String[] args) {
        int []nums={10,20,30,40,50};
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        System.out.println();
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    
}
