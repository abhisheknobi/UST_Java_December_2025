package Java_Assignment_Questions.OOPS;

public class Car {
    String brand;
    String model;
    float price;
    Car(){
        
    }

    Car(String brand, String model, float price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    public static void main(String[] args) {
        Car car1=new Car("Toyota", "Camry", 24000.0f);
        System.out.println("Car Brand :"+car1.brand);
        System.out.println("Car Model :"+car1.model);
        System.out.println("Car Price :"+car1.price);
        Car car2=new Car();
    }
    
}
