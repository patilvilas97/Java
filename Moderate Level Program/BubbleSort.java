import java.util.Scanner;

public class BubbleSort{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of Elements : ");
        int size = in.nextInt();
        int [] array = new int [size];
        for(int i=0; i<size; i++){
            System.out.print("Enter Element no " + i + ": ");
            array[i] = in.nextInt();
        }
        for(int j=0; j<size; j++){
            for(int k=0; k<size-1; k++){
                if(array[k+1] < array[k]){
                    int temp = array[k+1];
                    array[k+1] = array[k];
                    array[k] = temp;
                }
            }
        }
        for (int i=0; i<size; i++) {
            System.out.println(array[i] + " ");
        }
    }
}