
import java.util.Scanner;

public class SwapCaseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please Enter the String: ");
		str = scan.nextLine();
		StringBuffer str1 = new StringBuffer(str);
		
		
		for(int i=0;i<str1.length();i++) {
			Character c = str1.charAt(i);
			if(Character.isLowerCase(c)) {
				str1.replace(i, i+1, Character.toUpperCase(c)+"");
				
			}else {
				str1.replace(i, i+1, Character.toLowerCase(c)+"");
			}
		}
		
		System.out.println(str1);
	}

}
