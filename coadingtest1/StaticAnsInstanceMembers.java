package coadingtest1;
class Student{
    private  int studentId;
    private String name;
    private  static  int totalStudents =0;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        totalStudents++;
    }
    public void enroll(){
        System.out.println(name+ " new student enroll");
        totalStudents++;
    }
    public void drop(){
        System.out.println(name+" student is dropped");
        totalStudents--;

    }

    public static int getTotalStudents() {
        return totalStudents;
    }
}
public class StaticAnsInstanceMembers {
    public static void main(String[] args){
        Student s1= new Student(1,"s");
        Student s2= new Student(2,"c");

        s1.enroll();
        s1.enroll();

        System.out.println("Total students: " + Student.getTotalStudents());
        s1.drop();
        System.out.println("Total students after drop: " + Student.getTotalStudents());
    }
}
