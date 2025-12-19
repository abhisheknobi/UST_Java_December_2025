package Java_Assignment_Questions.OOPS;
/*
Variables: email, password
•     One constructor takes email only
•     Another takes email & password
•     Display user credentials. */
public class User {
    String email;
    String password;

    User(String email){
        this.email=email;
    }
    User(String email,String password){
        this.email=email;
        this.password=password;
    }
    public void showCredentials(){
        System.out.println("Email :"+email);
        System.out.println("Password :"+password);
    }

    public static void main(String[] args) {
        User u1=new User("manish@gmail.com");
        u1.showCredentials();
        User u2=new User("hello@gmail.com","12345");
        u2.showCredentials();
    }
}
