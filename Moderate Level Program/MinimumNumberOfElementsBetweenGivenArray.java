
import java.util.Scanner;
public class MinimumNumberOfElementsBetweenGivenArray{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int [n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int x = in.nextInt();
        int y = in.nextInt();
        MinimumNumberOfElementsBetweenGivenArray obj = new MinimumNumberOfElementsBetweenGivenArray();
        int count = obj.Counting(arr, n, x, y);
        System.out.println("Count : " + count);
    }
    public int Counting(int [] arr, int n, int x, int y){
        int ctr = -1;
        if(x==y){
            return -1;
        }
        for(int i=0; i<n; i++){
           while(arr[i]==y){
               ctr++;
           }
            
        }
        return ctr;
    }
}