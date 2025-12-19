package Java_Assignment_Questions.OOPS;
/*
Variables: productId, productName, price
•     Constructor uses this keyword
•     Display product info. */
public class Product {
    int productId;
    String productName;
    float price;

    Product(int productId, String productName, float price){
        this.productId=productId;
        this.productName=productName;
        this.price=price;
    }

    public void showProductInfo(){
        System.out.println("Product ID :"+productId);
        System.out.println("Product Name :"+productName);
        System.out.println("Price :"+price);
    }

    public static void main(String[] args) {
        Product p=new Product(101,"Laptop",50000.0f);
        p.showProductInfo();
    }
}