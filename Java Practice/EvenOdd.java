import java.util.Scanner;

import java.util.Scanner;
class EvenOdd{
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        num=in.nextInt();
        if(num==0){
            System.out.println("The Number is neither Even nor Odd");
        }
        else if(num%2==0){
            System.out.println("The Number is Even");
        }
        else{
            System.out.println("The Number is Odd");
        }
    }
}