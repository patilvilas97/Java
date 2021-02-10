import java.util.Scanner;
public class ReversingANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the Number of Testcases : ");
        int testcases = in.nextInt();
        int rev = 0;
        while(testcases>0){
            System.out.print("Please Enter the Number : ");
            int number = in.nextInt();
            while (number!=0){
                rev = (rev*0) + (number%10);
                number = number/10;
            }
        System.out.print("The Reverse of a Number is : " + rev);
        testcases--;
        }
    }
}
