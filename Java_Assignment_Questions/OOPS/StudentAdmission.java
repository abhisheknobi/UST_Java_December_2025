package Java_Assignment_Questions.OOPS;

public class StudentAdmission {
    String type;

StudentAdmission(){
    this.type="General";

} 

StudentAdmission(String name){
    this.type="Merit";

}
public void  displaytype(){
    System.out.println("Admission Type :"+type);
}

public static void main(String[] args) {
    StudentAdmission sa1=new StudentAdmission("Alice");
    sa1.displaytype();
    StudentAdmission sa2=new StudentAdmission();
    sa2.displaytype();
}
}
