/*Kattapa was known to be a very superstitious person. He believed that a soldier is "lucky" if the soldier is holding an even number 
of weapons, and "unlucky" otherwise. He considered the army as "READY FOR BATTLE" if the count of "lucky" soldiers is strictly 
greater than the count of "unlucky" soldiers, and "NOT READY" otherwise.*/

import java.util.Scanner;
public class Mahasena {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the  Number of Testcases : ");
        int testcases = in.nextInt();
        while(testcases>0){
            System.out.print("Please Enter the number of Soldiers : ");
            int number_of_soldiers = in.nextInt();
            if(number_of_soldiers%2 == 0){
                System.out.println("The Soldiers are Ready for Battle");
            }
            else{
                System.out.println("The Soldiers are Not Ready for Battle");
            }
            testcases--;
        }
    }
}