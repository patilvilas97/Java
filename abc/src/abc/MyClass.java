package abc;

import java.util.Scanner;
public class MyClass {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int temp = 0;
		int ctr = 0;
		if(N>10) {
			int A = N%10;
			ctr = N/10 + A;
		}
		else {
			int A = N%7;				//2
			ctr = N/7 + A;
		}
		System.out.println(ctr);
	}

}
