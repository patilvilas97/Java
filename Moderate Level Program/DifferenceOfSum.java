/*The function accepts two integers n, m as arguments Find the sum of all numbers in range from 1 to m(both inclusive) that are not 
divisible by n. Return difference between sum of integers not divisible by n with sum of numbers divisible by n.*/
import java.util.Scanner;
public class DifferenceOfSum{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int divisible_sum = 0;
        int not_divisible_sum = 0;
        int array [] = new int [m]; 
        for(int i=0; i<m; i++){
            array[i] = i+1;
        }
        for(int j=0; j<array.length; j++){
            if(array[j]%n == 0){
                divisible_sum +=array[j];
            }
            else{
                not_divisible_sum +=array[j];
            }
        }
        int difference = not_divisible_sum - divisible_sum;
        System.out.println(difference);
    }
}