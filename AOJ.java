import java.util.Arrays;

class Student{
    String name;
    int rollno;
    int marks;
}


public class AOJ{
    public static void main(String[] args){
        Student S1=new Student();
        S1.name="Saloni";
        S1.rollno=120;
        S1.marks=90;


        Student S2=new Student();
        S2.name="Priya";
        S2.rollno=110;
        S2.marks=100;

        Student S3=new Student();
        S3.name="jaya";
        S3.rollno=1;
        S3.marks=11;


        Student students[]=new Student[3];
        students[0]=S1;
        students[1]=S2;
        students[2]=S3;


        for(int i=0;i<students.length;i++){
            // System.out.println(students[i].name+":"+students[i].rollno+":"+students[i].marks);
            // System.out.println(Arrays.toString(students.name+":"+);
        }
        //Enhnaced For loop
        for(Student S:students){
            System.out.println(S.name+":"+S.rollno+":"+S.marks);
        }
    }
}
