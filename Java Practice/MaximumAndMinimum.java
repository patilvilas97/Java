import java.util.Scanner;
class MaximumAndMinimum{
    public static void main(String[] args){
        int size;
        int max;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Number of Elements : ");
        size= in.nextInt();
        int array[]= new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter the " + i + " Element :");
            array[i]= in.nextInt();
        }
        max=array[0];
        for(int k=0; k<size; k++){
            if(array[k]>max){
                max=array[k];
            }
        }
        System.out.print("The Maximum Element is " + max);
    }
}