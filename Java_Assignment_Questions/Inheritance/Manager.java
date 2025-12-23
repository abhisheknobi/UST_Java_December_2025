package Java_Assignment_Questions.Inheritance;

public class Manager extends Employee {
    float bonus;

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.salary = 75000.50f;
        manager.bonus = 15000.75f;

        System.out.println("Total Compensation: " + (manager.salary + manager.bonus));
    }
    
}
