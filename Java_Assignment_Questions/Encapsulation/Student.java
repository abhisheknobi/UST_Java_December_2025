package Java_Assignment_Questions.Encapsulation;
/*
Private variables: id, name
•     Public getters & setters
•     Display details using getter methods. Concepts: Data hiding, getter/setter */
public class Student {
    private int id;
    private String name;

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student ID: " + getId());
        System.out.println("Student Name: " + getName());
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(1);
        student.setName("Alice");
        student.displayDetails();
    }
}