package abc;
import java.util.Scanner;
public class ass {
	    public static void main(String[] args) {
	    	  int[][] dataset = {{11, 12, 13},
	    			  			{14, 15, 11},
	    			  			{1, 1, 1}};
	    	  unacppted(dataset);
	    }
	    public static void unacppted(int [][] a) {
	    	 int sum = 0;
	    	 int ctr = 0;
	    	 int[] c = new int[3];
//	    	 for (int i = 0; i < a.length; i++)
//	    	      for (int j = 0; j < a[0].length; j++) {
//	    	         // Check for main diagonal element.
//	    	         if (i == j) {
//	    	        	c[ctr]=a[i][j];
//	    	            sum += a[i][j];
//	    	            ctr++;
//	    	         }
//	    	       }
//	    	 ctr=0;
	    	    for (int i = 0; i < a.length; i++)
		    	      for (int j = 0; j < a[0].length; j++) {
		    	    	  if(i==j) {
		    	    		  c[ctr]=a[i][j];
		    	    		  continue;
		    	    	  }
		    	    	  if(a[i][j] == c[0]) {
		    	    		  c[0]=0;
		    	    		  ctr++;
		    	    	  }else if(a[i][j] == c[1]) {
		    	    		  c[1]=0;
		    	    		  ctr++;
		    	    	  }else if(a[i][j] == c[2]) {
		    	    		  c[2]=0;
		    	    		  ctr++;
		    	    	  }
		    	    	  
		    	      }
	    	    sum = c[0]+ c[1]+ c[2];
	    	    
	    	     System.out.println(sum);
	    }


}
