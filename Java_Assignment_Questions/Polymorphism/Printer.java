package Java_Assignment_Questions.Polymorphism;

public class Printer {
    public void print(String message){
        System.out.println("String message: " + message);
    }
    
    public void print(int number){
        System.out.println("Integer number: " + number);
    }

    public void print(int num, String message){
        System.out.println("Integer number: " + num);
        System.out.println("String message: " + message);
    }
    
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Hello, World!");
        printer.print(42);
        printer.print(3, "Java Polymorphism");
        String str="123";
        int count=0;
        for(int i=0;i<str.length();i++) {
        	
        	count+=Integer.parseInt(String.valueOf(str.charAt(i)));
        	System.out.println(count);
        }

    }
    
}
