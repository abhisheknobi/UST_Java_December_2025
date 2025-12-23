package Java_Assignment_Questions.Inheritance;

public class Car extends Vehicle {
    String brand;

    public static void main(String[] args) {
        Car car=new Car();
        car.speed=120;
        car.brand="Toyota";
        System.out.println("Brand: " + car.brand);
        System.out.println("Speed: " + car.speed + " km/h");
    }
    
}
