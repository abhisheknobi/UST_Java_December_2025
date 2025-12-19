package Java_Assignment_Questions.OOPS;

public class Student {
    int id;
    String name;

    public void displayDetails(){
        System.out.println("Student Name :"+name);
        System.out.println("Student ID :"+id);
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.displayDetails();
    }
    
}
