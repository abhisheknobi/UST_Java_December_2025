package Java_Assignment_Questions.Encapsulation;
/*Create Customer class:
•     Private: name, age
•     Setter restricts age ≥ 18
•     Getter returns formatted data Concepts: Validation inside setters
 */
public class Customer {
    private String name;
    private int age;

    public void setAge(int age){
        if(age<18)
            this.age=18;
        else
            this.age=age;
    }

    public String getAge(){
        return name + " is " + age + " years old.";
    }

    public static void main(String[] args) {
        Customer cust=new Customer();
        cust.name="John";
        cust.setAge(16); // This should trigger validation
        System.out.println(cust.getAge());
        Customer cust2=new Customer();
        cust2.name="Doe";
        cust2.setAge(25);
        System.out.println(cust2.getAge());
        
    }
      
}
