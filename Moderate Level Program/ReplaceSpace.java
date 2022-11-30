
import java.util.Scanner;

public class ReplaceSpace    
{    
    public static void main(String[] args) {    
       
    	String str;
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Please Enter Your Full Name: ");
    	str = scan.nextLine();
    
    	char ch = '*';
    	
    	str = str.replace(' ', ch);
    	System.out.println(str);
    }    
}      