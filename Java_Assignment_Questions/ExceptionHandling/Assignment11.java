package Java_Assignment_Questions.ExceptionHandling;

import java.io.IOException;

class Parent {
    // Parent method throws a checked exception
    void show() throws IOException {
        System.out.println("Parent show()");
    }
}

class Child extends Parent {
    // Requirement: Child class should not throw broader checked exceptions [cite: 97]
    // We can throw the same exception, a subclass of it, or no exception at all.
    // Throwing 'Exception' (broader) here would cause a compile error.
    @Override
    void show() throws IOException { 
        System.out.println("Child show()");
    }
}

public class Assignment11 {
    public static void main(String[] args) {
        Parent obj = new Child();
        try {
            obj.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Requirement: Program should compile and run successfully [cite: 99]
        System.out.println("Program compiled and ran successfully.");
    }
}
