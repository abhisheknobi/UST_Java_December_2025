package Java_Assignment_Questions.Polymorphism;

public class Area {
    public double area(double radius){
        return Math.PI*radius*radius;
    }
    
    public double area(double length, double breadth){
        return length*breadth;
    }
    
    public double area(int side){
        return side*side;
    }
    
    
    public static void main(String[] args) {
        Area areaCalculator=new Area();
        
        double circleArea=areaCalculator.area(5.0);
        System.out.println("Area of Circle: " + circleArea);
        
        double rectangleArea=areaCalculator.area(4.0, 6.0);
        System.out.println("Area of Rectangle: " + rectangleArea);
        
        double squareArea=areaCalculator.area(4);
        System.out.println("Area of Square: " + squareArea);
    }
    
}
