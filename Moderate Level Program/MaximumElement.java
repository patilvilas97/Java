/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class MaximumElement {
	public static void main (String[] args) {
	    int testcases;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Testcases : ");
		testcases=scan.nextInt();
		while(testcases!=0){
            int size;
            int max=0;
		    System.out.print("Enter the Size : ");
		    size=scan.nextInt();
		    int testarray [] = new int [size];
		    for(int i=0; i<size; i++){
		        testarray[i]=scan.nextInt();
		    }
		    for( int k : testarray){
		        if(k>max){
		            max=k;
		        }
		    }
            System.out.println("The Maximum Element in the Array is " + max);
            testcases--;
		}
	}
}