import java.util.Scanner;
public class MultiplicationOfArray {
    public static void main(String[] args) {
        int size;
        int mul=1;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        size=in.nextInt();
        int numbers[]= new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter the " + i + " Element : ");
            numbers[i]=in.nextInt();
            mul*=numbers[i];
        }
        System.out.print("The Multiplication of All Elements of Array is : " + mul);
    }
}
