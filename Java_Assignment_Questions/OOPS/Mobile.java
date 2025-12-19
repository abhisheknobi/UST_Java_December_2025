package Java_Assignment_Questions.OOPS;
/*
Fields: brand, ram, storage, price
•     Create multiple objects using different constructors
•     Print mobile configuration. */
public class Mobile {
    String brand;
    int ram;
    int storage;
    float price;

    Mobile(){
    }

    Mobile(String brand){
        this.brand=brand;
    }

    Mobile(String brand, int ram, int storage, float price){
        this.brand=brand;
        this.ram=ram;
        this.storage=storage;
        this.price=price;
    }
    Mobile(String brand, int ram){
        this.brand=brand;
        this.ram=ram;
    }
    Mobile(String brand, int ram, int storage){
        this.brand=brand;
        this.ram=ram;
        this.storage=storage;
    }

    public static void main(String[] args) {
        Mobile m1=new Mobile();
        Mobile m2=new Mobile("Samsung");
        Mobile m3=new Mobile("Apple", 4, 64, 699.99f);
        Mobile m4=new Mobile("OnePlus", 8);
        Mobile m5=new Mobile("Xiaomi", 6, 128);

        System.out.println("Mobile 1: Brand="+m1.brand+", RAM="+m1.ram+", Storage="+m1.storage+", Price="+m1.price);
        System.out.println("Mobile 2: Brand="+m2.brand+", RAM="+m2.ram+", Storage="+m2.storage+", Price="+m2.price);
        System.out.println("Mobile 3: Brand="+m3.brand+", RAM="+m3.ram+", Storage="+m3.storage+", Price="+m3.price);
        System.out.println("Mobile 4: Brand="+m4.brand+", RAM="+m4.ram+", Storage="+m4.storage+", Price="+m4.price);
        System.out.println("Mobile 5: Brand="+m5.brand+", RAM="+m5.ram+", Storage="+m5.storage+", Price="+m5.price);
    }
    
}
