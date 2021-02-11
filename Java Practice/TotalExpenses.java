import java.util.Scanner;
public class TotalExpenses{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the Number of Testcases : ");
        int testcases = in.nextInt();
        while(testcases>0){
            System.out.print("Please Enter the Price : ");
            long price = in.nextLong();
            System.out.print("Please Enter the Quantity : ");
            int quantity = in.nextInt();
            long total_expense;
            if(price>1000){
                long expense = price - (price*10/100);
                total_expense = expense*quantity;
                System.out.println("The Total Expense is : " + total_expense);
            }
            else{
                total_expense = price * quantity;
                System.out.println("The Total Expense is : " + total_expense);
            }
            testcases--;
        }
    }
}