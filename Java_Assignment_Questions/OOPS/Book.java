package Java_Assignment_Questions.OOPS;

public class Book {
    String title;
    String author;
    double price;

    Book(){
        this.title="Unknown";
        this.author="Unknown";
        this.price=0.0;
    }

    Book(String title, String author, double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public static void main(String[] args) {
        Book book1=new Book("1984", "George Orwell", 9.99);
        System.out.println("Book Title :"+book1.title);
        System.out.println("Book Author :"+book1.author);
        System.out.println("Book Price :"+book1.price);

        Book book2=new Book();
        System.out.println("Book Title :"+book2.title);
        System.out.println("Book Author :"+book2.author);
        System.out.println("Book Price :"+book2.price); 
    }
}