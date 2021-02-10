import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the Choice : ");
        Calculator obj = new Calculator();
        int choice = in.nextInt();
        switch(choice){
            case 1 :
                obj.addition();
                break;
            case 2 :
                obj.substraction();
                break;
            case 3 : 
                obj.multiplication();
                break;
            case 4 :
                obj.addition();
                break;
            default :
                System.out.print("Invalid Input");
        }
    }
    public void addition(){
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the 1st Number : ");
        int num1 = in.nextInt();
        System.out.print("Please Enter the 2nd Number : ");
        int num2 = in.nextInt();
        int result = num1 + num2;
        System.out.println("The Addition is : " + result);
    }
    public void substraction(){
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the 1st Number : ");
        int num1 = in.nextInt();
        System.out.print("Please Enter the 2nd Number : ");
        int num2 = in.nextInt();
        int result = num1 - num2;
        System.out.print("The Substraction is : " + result);
    }
    public void multiplication(){
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the 1st Number : ");
        int num1 = in.nextInt();
        System.out.print("Please Enter the 2nd Number : ");
        int num2 = in.nextInt();
        int result = num1 * num2;
        System.out.println("The Multiplication is : " + result);
    }
    public void division(){
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the 1st Number : ");
        int num1 = in.nextInt();
        System.out.print("Please Enter the 2nd Number : ");
        int num2 = in.nextInt();
        double result = num1/num2;
        System.out.print("The Division is " + result);
    }
}
