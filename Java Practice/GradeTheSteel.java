/*A certain grade of steel is graded according to the following conditions.

Hardness must be greater than 50.
Carbon content must be less than 0.7.
Tensile strength must be greater than 5600.

The grades are as follows:
Grade is 10 if all three conditions are met.
Grade is 9 if conditions (i) and (ii) are met.
Grade is 8 if conditions (ii) and (iii) are met.
Grade is 7 if conditions (i) and (iii) are met.
Garde is 6 if only one condition is met.
Grade is 5 if none of three conditions are met.*/

import java.util.Scanner;
public class GradeTheSteel{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the Testcases : ");
        int testcases = in.nextInt();
        while(testcases-->0){
            System.out.print("Please Enter the Hardness : ");
            int hardness = in.nextInt();
            System.out.print("Please Enter the Carbon Content : ");
            Double carbon_content = in.nextDouble();
            System.out.print("Please Enter the Tensile Strength : ");
            int tensile_strength = in.nextInt();
            if(hardness>50 && carbon_content<0.7 && tensile_strength>5600){
                System.out.println("Grade is 10");
            }
            else if(hardness>50 && carbon_content<0.7){
                System.out.println("Grade is 9");
            }
            else if(carbon_content<0.7 && tensile_strength>5600){
                System.out.println("Grade is 8");
            }
            else if(hardness>50 && tensile_strength>5600){
                System.out.println("Grade is 7");
            }
            else if(hardness>50 || carbon_content<0.7 || tensile_strength>5600){
                System.out.println("Grade is 6");
            }
            else{
                System.out.println("Grade is 5");
            }
        }
    }
}