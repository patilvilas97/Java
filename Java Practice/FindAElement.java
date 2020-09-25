import java.util.Scanner;
public class FindAElement {
    public int search(int [] array, int num){
        int ctr=0;
        for(int k : array){
            if(k==num){
                 ctr++;
                 break;
             }
        }
        return ctr;
    }
    public void print(int ctr, int num){
        if(ctr==0){
            System.out.print("The element " + num + " is not Present");
        }
        else{
            System.out.print("The element " + num + " is Present");
        }
    }
    public static void main(String[] args) {
        int size;
        int num;
        int ctr;
        System.out.print("Enter the Number of elements : ");
        Scanner in = new Scanner(System.in);
        size=in.nextInt();
        int array[]= new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter the number : ");
            array[i]=in.nextInt();
        }
        System.out.print("Enter the Number to be find : ");
        num=in.nextInt();
        FindAElement obj = new FindAElement();
        ctr=obj.search(array, num);
        FindAElement obj1 = new FindAElement();
        obj1.print(ctr, num);
    }
}
