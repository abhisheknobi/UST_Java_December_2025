package Java_Assignment_Questions.Section_5;

public class Thirty {
    public static void main(String[] args) {
        String str="abhi";
        int left=0;
        int right=str.length()-1;
        boolean isPalindrome=true;
        str=str.toLowerCase();
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                isPalindrome=false;
                break;
            }
            left++;
            right--;

        }
        if(isPalindrome){
            System.out.println("palindrome.");
        }else{
            System.out.println("not a palindrome.");
    }
}
}
