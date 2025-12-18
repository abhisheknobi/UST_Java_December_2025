package Java_Assignment_Questions.Section_5;

public class ThirtyOne {
    public static void main(String[] args) {
        String str="This is a sample string";
        int words=1;
        for(int i=0;i<str.length();i++){
            if(Character.isWhitespace(str.charAt(i)) && i!=str.length()-1){
                words++;
            }
        }
        System.out.println("Number of words: "+words);
    }
}
