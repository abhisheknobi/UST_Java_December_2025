package Java_Assignment_Questions.OOPS;

public class Employee {
     int empId;
     String empName;
     float salary;

    Employee(){
        this.empId=101;
        this.empName="John Doe";
        this.salary=50000.0f;
    }

    public static void main(String[] args) {
        Employee emp=new Employee();
        System.out.println("Employee ID :"+emp.empId);
        System.out.println("Employee Name :"+emp.empName);
        System.out.println("Employee Salary :"+emp.salary);
    }  
}
