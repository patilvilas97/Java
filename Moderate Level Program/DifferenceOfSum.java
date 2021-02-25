/*The function accepts two integers n, m as arguments Find the sum of all numbers in range from 1 to m(both inclusive) that are not 
divisible by n. Return difference between sum of integers not divisible by n with sum of numbers divisible by n.*/
import java.util.Scanner;
public class DifferenceOfSum{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the Divident : ");
        int n = in.nextInt();
        System.out.print("Please Enter the Limit : ");
        int m = in.nextInt();
        DifferenceOfSum difference = new DifferenceOfSum();
        difference.divisible_diff(n, m);
    }
    public void divisible_diff(int n, int m){
        int divisible_sum = 0;
        int not_divisible_sum = 0; 
        for(int i=1; i<=m; i++){
            if(i%n == 0){
                divisible_sum += i;
            }
            else{
                not_divisible_sum += i;
            }
        }
        System.out.println("The Difference is : " + (not_divisible_sum - divisible_sum));
    }
}