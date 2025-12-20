package Java_Assignment_Questions.Encapsulation;

public class Admission {
    private  int marks;
    private String grade;

    public void setMarks(int marks){
        if(marks>=90 && marks<=100)
        {
            this.marks=marks;
            this.grade="A";
        }
        else if(marks>=75 && marks<90)
        {
            this.marks=marks;
            this.grade="B";
        }
        else if(marks>=60 && marks<75)
        {
            this.marks=marks;
            this.grade="C";
        }
        else
        {
            this.marks=marks;
            this.grade="D";
        }
    }

     public String getGrade(){
            return grade;
     }

     public static void main(String[] args) {
        Admission admission=new Admission();
        admission.setMarks(85);
        System.out.println("Grade :"+admission.getGrade());
        
     }
    
}
