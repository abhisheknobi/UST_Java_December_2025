package Java_Assignment_Questions.OOPS;

public class Person {
    
    String name;
    int age;

    Person(){
        this("Unknown",10);

    }

    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public static void main(String[] args) {
        Person p1=new Person("Alice",25);
        System.out.println("Person Name :"+p1.name);
        System.out.println("Person Age :"+p1.age);

        Person p2=new Person();
        System.out.println("Person Name :"+p2.name);
        System.out.println("Person Age :"+p2.age);
    }
}
