package Java_Assignment_Questions.Encapsulation;
/*
Private: brand, price
•     Getter returns price with GST Concepts: Logic in getter
 */
public class Mobile {
    private String brand;
    private float price;

    public float getPrice(){
        return price+(price*0.18f);
    }

    public static void main(String[] args) {
        Mobile mob=new Mobile();
        mob.brand="Samsung";
        mob.price=20000.0f;
        System.out.println("Mobile Brand :"+mob.brand);
        System.out.println("Mobile Price with GST :"+mob.getPrice());
    }
    
}
