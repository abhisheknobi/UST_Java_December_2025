package Java_Assignment_Questions.Section_4;

public class TwentySeven {
    public static void main(String[] args) {
        int nums[]={50,40,30,20,10};
        System.out.println("Array before sorting:");
        for(int k=0;k<nums.length;k++){
                System.out.print(nums[k]+" ");
            }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j+1]<nums[j]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        System.out.println("\nArray after sorting:");
         for(int k=0;k<nums.length;k++){
                System.out.print(nums[k]+" ");
            }
    }
    
}
