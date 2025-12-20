package Java_Assignment_Questions.Encapsulation;
/*
     Private: price
•     Setter allows price only between 100 – 100000 Concepts: Business rule encapsulation */
public class Product {
    private float price;

    public void setPrice(float price){
        if(price<100 || price>100000)
            this.price = 100; // default value
        else
            this.price = price;
    }
    public float getPrice(){
        return price;
    }
    public static void main(String[] args) {
        Product prod=new Product();
        prod.setPrice(5000.0f);
        System.out.println("Product Price :"+prod.getPrice());
        Product prod2=new Product();
        prod2.setPrice(150000.0f); // This should trigger validation
        System.out.println("Product Price :"+prod2.getPrice());
    }
    
}
