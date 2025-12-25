package Java_Assignment_Questions.Section_5;

public class TwentyEight {
    public static void main(String[] args) {
        String str="abcdef ghij klmno pqrst uvwxyz";
        int v=0;
        int c=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isWhitespace(ch))
                continue;
            else if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                v++;
            else
                c++;
        }
        System.out.println("Number of vowels: "+v);
        System.out.println("Number of consonants: "+c);
    }
    
}
