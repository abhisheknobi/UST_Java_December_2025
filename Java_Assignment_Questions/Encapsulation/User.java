package Java_Assignment_Questions.Encapsulation;

public class User {
    private String email;
    private String password;

    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    public void setPassword(String password){
        if(password.length()>=8)
        this.password=password;
        else
        System.out.println("Password must be at least 8 characters long.");
    }

    public String getPassword(){
        return password;
    }

    public static void main(String[] args) {
        User user=new User();
        user.setEmail("new@gmail.com");
        user.setPassword("mypassword");
        System.out.println("Email :"+user.getEmail());
        System.out.println("Password :"+user.getPassword());
        
    }
    
}
