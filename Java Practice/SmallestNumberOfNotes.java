import java.util.Scanner; 
public class SmallestNumberOfNotes{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the number of testcases : ");
        int testcases = in.nextInt();
        while(testcases>0){
            System.out.print("Please Enter the Amount : ");
            int amount = in.nextInt();
            int notes_100 = amount/100;
            int temp = amount - notes_100 * 100;
            int notes_50 =_temp/50;
            int temp = amount - temp
        }
    }
}