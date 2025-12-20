package Java_Assignment_Questions.Encapsulation;
/*     Private: empId, salary
•     Setter restricts salary > 0
•     Method displaySalary()
Concepts: Controlled access
 */
public class Employee {
    private int empId;
    private float salary;

    public void setSalary(float salary) {
        if(salary<0)
            this.salary = 0;
        else
            this.salary = salary;
    }

    public float getSalary(){
        return salary;
    }
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.empId=1001;
        emp.setSalary(75000.0f);
        System.out.println("Employee ID :"+emp.empId);
        System.out.println("Employee Salary :"+emp.getSalary());
        Employee emp2=new Employee();
        emp2.empId=1002;
        emp2.setSalary(-5000.0f); // This should trigger validation
        System.out.println("Employee ID :"+emp2.empId);
        System.out.println("Employee Salary :"+emp2.getSalary());
    }
}
