package Java_Assignment_Questions.Section_5;

public class TwenyNine {
    public static void main(String[] args) {
        String str="Hello World from Java";
        StringBuilder reversedStr=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            reversedStr.append(str.charAt(i));
        }
        System.out.println("Original String: "+str);
        System.out.println("Reversed String: "+reversedStr.toString());
    }
    
}
