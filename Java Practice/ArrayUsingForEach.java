import java.util.Scanner;
class ArayUsingForEach{
    public static void main(String[] args){
        int array[]= new int[5];
        Scanner in= new Scanner(System.in);
        for(int i=0; i<5; i++){
            System.out.print("Enter the "+ i + "Number : ");
            array[i]=in.nextInt();
        }
        System.out.print("The Elements are : ");
        for(int j : array){
            System.out.print(j + " ");
        }
    }
}