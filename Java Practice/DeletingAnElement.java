import java.util.Scanner;
public class DeletingAnElement{
    public static void main(String[] args) {
        int size;
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Size : ");
        size=in.nextInt();
        int array[]= new int [size];
        for(int i=0; i<size; i++){
            System.out.print("Input the Number : ");
            array[i]=in.nextInt();
        }
        System.out.print("Before Deleting : ");
        for(int i=0; i<size; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Input the Number to be Deleted : ");
        num=in.nextInt();
        for(int i=0; i<size; i++){
            if(array[i]==num){
                array[i]=0;
                size--;
            }
        }
        System.out.print("After Deleting : ");
        for (int k : array) {
            System.out.print(k + " ");
        }
    }
}
