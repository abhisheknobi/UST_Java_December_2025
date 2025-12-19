package Java_Assignment_Questions.OOPS;
/*
Fields: bookId, title, author
•     Constructor assigns values
•     Method isAvailable() returns true/false */
public class LibraryBook {
    int bookId;
    String title;
    String author;

    LibraryBook(int bookId, String title, String author){
        this.bookId=bookId;
        this.title=title;
        this.author=author;
    }

    public boolean isAvailable(int bookId){
        if(bookId==0)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        LibraryBook lb=new LibraryBook(201,"The Alchemist","Paulo Coelho");
        System.out.println("Is the book available? :"+lb.isAvailable(lb.bookId));
        LibraryBook lb2=new LibraryBook(0,"Unknown","Unknown");
        System.out.println("Is the book available? :"+lb2.isAvailable(lb2.bookId));
    }
    
}
