import java.util.Scanner;

/*Chef is teaching a cooking course. There are N students attending the course, numbered 1 through N.Before each lesson, 
Chef has to take attendance, i.e. call out the names of students one by one and mark which students are present. Each student 
has a first name and a last name. In order to save time, Chef wants to call out only the first names of students. 
However, whenever there are multiple students with the same first name, Chef has to call out the full names (both first and last names) 
of all these students. For each student that does not share the first name with any other student, Chef may still call out only this 
student's first name. Help Chef decide, for each student, whether he will call out this student's full name or only the first name.*/

import java.util.Scanner;
public class Attendance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testcases;
        int number_of_students;
        System.out.print("Please Enter the Testcases : ");
        testcases = in.nextInt();
        System.out.print("Please Enter the Number of Students : ");
        number_of_students = in.nextInt();
        String [] first_name = new String[number_of_students];
        String [] last_name = new String[number_of_students];
        String [] students = new String[number_of_students];
        for(int i=0; i<number_of_students; i++){
            System.out.print("Please Enter the Name of  Student : ");
            first_name[i] = in.next();
            last_name[i] = in.next();
        }
        for(int j=0; j<number_of_students; j++){
            for(int k=0; k<number_of_students; k++){
                if(first_name[j] == first_name[k]){
                    students[k] = first_name[k] + last_name[k];
                }
                else{
                    students[j] = first_name[j];
                }
            }
        }
        for (String l : students) {
            System.out.println(l);
        }
    }
}
