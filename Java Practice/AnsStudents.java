/*Write a program to print the names of students by creating a Student class. If no name is passed while creating an 
object of Student class, then the name should be "Unknown", otherwise the name should be equal to the String value
passed while creating object of Student class.*/
public class AnsStudents{
    public static void main(String[] args) {
        Student student1 = new Student("Vilas");
        Student student2 = new Student("Shubham");
        Student student3 = new Student();
        Student student4 = new Student("Kalpesh");
        Student student5 = new Student();
        Student student6 = new Student("Mukesh");
        Student student7 = new Student("Bharat");
        Student student8 = new Student();
        Student student9 = new Student("Lokesh");
        Student student10 = new Student("Ankush");
        System.out.println(student1.name);
        System.out.println(student2.name);
        System.out.println(student3.name);
        System.out.println(student4.name);
        System.out.println(student5.name);
        System.out.println(student6.name);
        System.out.println(student7.name);
        System.out.println(student8.name);
        System.out.println(student9.name);
        System.out.println(student10.name);
    }
}
class Student{
    String name;
    Student(){
        name = "Unknown";
    }
    Student(String x){
        name = x;
    }
}