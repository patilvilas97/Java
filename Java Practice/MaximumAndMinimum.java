import java.util.Scanner;
class MaximumAndMinimum{
    public void maximum(int [] array, int size){
        int max;
        max=array[0];
        for(int k=0; k<size; k++){
            if(array[k]>max){
                max=array[k];
            }
        }
        System.out.println("The Maximum Element is " + max);
    }
    public void minimum(int [] array, int size){
        int min;
        min=array[0];
        for(int l=0; l<size; l++){
            if(array[l]<min){
                min=array[l];
            }
        }
        System.out.print("The Maximum Element is " + min);
    }
    public static void main(String[] args){
        int size;
        int min;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Number of Elements : ");
        size= in.nextInt();
        int array[]= new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter the " + i + " Element :");
            array[i]= in.nextInt();
        }
        MaximumAndMinimum maxi = new MaximumAndMinimum();
        maxi.maximum(array, size);
        MaximumAndMinimum mini = new MaximumAndMinimum();
        mini.minimum(array, size);
    }
}
