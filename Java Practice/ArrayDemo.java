import java.util.Scanner;
class ArrayDemo{
    public static void main(String[] args) {
        int array[]= new int[5];
        Scanner in=new Scanner(System.in);
        for(int i=0; i<5; i++){
            System.out.print("Enter the " +i+ " element : ");
            array[i]=in.nextInt();
        }
        for(int i=0; i<5; i++){
            System.out.println("The elements are "+ array[i]);
        }
    }
}