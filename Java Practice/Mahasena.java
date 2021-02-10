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
