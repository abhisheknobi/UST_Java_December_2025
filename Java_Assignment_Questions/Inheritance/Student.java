package Java_Assignment_Questions.Inheritance;

class Person {
    String name;
    int age;

    Person(String name){
        this.name=name;
    }
   
}

public class Student extends Person {
    Student(String name, int rollNo){
        super(name);
        this.rollNo=rollNo;
    }
    int rollNo;

    public static void main(String[] args) {
        Student student = new Student("Alice", 101);
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Roll No: " + student.rollNo);   

        // Creating another Student object to show default values
        Student student2 = new Student("Bob", 102);
        System.out.println("Name: " + student2.name);
        System.out.println("Age: " + student2.age);
        System.out.println("Roll No: " + student2.rollNo);

    }
}

