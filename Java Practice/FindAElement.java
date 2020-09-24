import java.util.Scanner;
public class FindAElement {
    public static void main(String[] args) {
        int size;
        int num;
        int ctr=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number of elements : ");
        size=in.nextInt();
        int array[]= new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter the number : ");
            array[i]=in.nextInt();
        }
        System.out.print("Enter the Number to be find : ");
        num=in.nextInt();
        for(int k : array){
           if(k==num){
               ctr++;
           }
        }
        if(ctr==1){
            System.out.print
        }
    }
}
