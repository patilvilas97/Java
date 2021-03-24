/*The function accepts an integers arr of size ’length’ as its arguments you are required to return the sum of second largest 
largest element from the even positions and second smallest from the odd position of given ‘arr’*/
import java.util.Scanner;
public class ReturnSecondLargestElement{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the size of array : ");
        int size = in.nextInt();
        int arr [] = new int [size];
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        ReturnSecondLargestElement obj = new ReturnSecondLargestElement();
        obj.bubblesort(arr);
        int maxi = obj.maximumfromeven(arr);
    }
    public void bubblesort(int arr[]){
        int temp;
        for(int i=0; i<arr.length - 1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public int maximumfromeven(int arr){
        int even_array[] = new int [];
        for(int i=0; i<arr.length; i++){
            if(arr)
        }
    }
}