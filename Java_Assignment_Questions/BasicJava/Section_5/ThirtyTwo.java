package Java_Assignment_Questions.Section_5;

public class ThirtyTwo {
    public static void main(String[] args) {
        int[] hashh = new int[256];
        String str= "hello world";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            hashh[ch]++;
        }
        System.out.println("Character frequencies:");
        for(int i=0;i<256;i++){
            if(hashh[i]>1){
                System.out.println((char)i + ": " + hashh[i]);
            }
        }
    }
    
}
