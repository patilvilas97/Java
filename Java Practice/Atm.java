/*Pooja would like to withdraw X $US from an ATM. The cash machine will only accept the transaction if X is a multiple of 5, 
and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges). For each 
successful withdrawal the bank charges 0.50 $US. Calculate Pooja's account balance after an attempted transaction.*/
import java.util.Scanner;
public class Atm{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Double Balance;
        int Withdraw;
        System.out.print("Please Enter the Amount to be Withdrawn : ");
        Withdraw = in.nextInt();
        System.out.print("Please Enter the Account Balance : ");
        Balance = in.nextDouble();
        if(Withdraw>Balance){
            System.out.println("SORRY!! The Account has Insufficient Funds \nAvailable Balance : " + Balance);
        }
        else if(Withdraw%5 == 0){
            Balance -= Withdraw;
            Balance-=0.5;
            System.out.println("Available Balance : " + Balance);
        }
        else{
            System.out.println("Invalid Withdrawable Amount");
            System.out.println("Available Balance : " + Balance);
        }
    }
}