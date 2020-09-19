import java.util.Scanner;
class Swap{
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the 1st Number : ");
        num1=in.nextInt();
        System.out.println("Enter the 2nd Number : ");
        num2=in.nextInt();
        System.out.println("Before Swapping = " + num1 + ":" + num2);
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After Swapping = " + num1 + ":" + num2);
    }
}