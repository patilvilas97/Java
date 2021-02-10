import java.util.Scanner;
public class FindRemainder{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the Testcases : ");
        int testcases = in.nextInt();
        while(testcases>0){
            System.out.print("Please Enter the 1st Number : ");
            int num1 = in.nextInt();
            System.out.print("Please Enter the 2nd Number : ");
            int num2 = in.nextInt();
            int remainder = num1%num2;
            System.out.print("The Remainder is : " + remainder);
            System.out.println();
            testcases--;
        }
    }
}