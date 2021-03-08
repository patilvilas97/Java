/*There is a JAR full of candies for sale at a mall counter. JAR has the capacity N, 
that is JAR can contain maximum N candies when JAR is full. At any point of time. 
JAR can have M number of Candies where M<=N. Candies are served to the customers. 
JAR is never remain empty as when last k candies are left. JAR if refilled with new 
candies in such a way that JAR get full.

Write a code to implement above scenario. Display JAR at counter with available number 
of candies. Input should be the number of candies one customer can order at point of 
time. Update the JAR after each purchase and display JAR at Counter.
Output should give number of Candies sold and updated number of Candies in JAR. */

import java.util.Scanner;
public class TcsCandies {
    public static void main(String[] args) {
        int n = 10;
        int k = 5;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the candies to buy : ");
        int m = scan.nextInt();
        if(m<=0 || m>n){
            System.out.println("INVALID INPUT");
        }
        n -= m;
        if(n<=5){
            n=10;
        }
        System.out.println("The remaining Candies are " + n);
    }
}
