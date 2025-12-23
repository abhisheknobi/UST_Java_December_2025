package Java_Assignment_Questions.Inheritance;

public class Dog extends Animal {
    public void bark(){
        System.out.println("The dog barks.");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited method from Animal class
        dog.bark(); // Dog's own method
    }

    
}
