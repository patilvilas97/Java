import java.util.Scanner;
public class SumOfArray {
    public int add(){
        int size;
        int sum=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        size=in.nextInt();
        int numbers[]= new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter the " + i + " Element : ");
            numbers[i]=in.nextInt();
            sum+=numbers[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        SumOfArray obj = new SumOfArray();
        System.out.print("The Sum of All Elements of Array is : " + obj.add());
    }
}
