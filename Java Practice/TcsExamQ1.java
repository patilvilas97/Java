import java.util.Scanner;
public class TcsExamQ1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long bookCode = scan.nextLong();
        int result = 0; 
        if(String.valueOf(bookCode).length() == 10){
            for(int i = 10; i>=0; i--){
                int temp =(int) bookCode % 10;
                bookCode = bookCode /10;
                result = result + temp*i; 
            }
            if(result%11 == 0){
                System.out.println("1");
            }else{
                System.out.println('0');
            }
        }else{
            System.out.println("INVALID INPUT");
        }
                
    }
}