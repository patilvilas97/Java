

import java.util.Scanner;
public class MyClass {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int temp = 0;
		int ctr = 0;
		boolean flag = true;
		if(N>10) {
			while(flag) {
				N = N/10;
				ctr = N++;
			} 
		}
		
	}

}
