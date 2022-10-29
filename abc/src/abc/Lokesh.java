package abc;
import java.io.*;
import java.lang.*;
import java.util.*;
public class Lokesh {

	static final int MAX_CHARS=256;
	static String findsub(String str) {
		int n=str.length();
		int dist =0;
		boolean[] visited = new boolean[MAX_CHARS];
		Arrays.fill(visited, false);
		for(int i=0; i<n; i++) {
			if(visited[str.charAt(i)]==false) {
				visited[str.charAt(i)]=true;
				dist++;
			}
		}
		int start =0, index=-1;
		int minlen = Integer.MAX_VALUE;
		int count =0;
		int[] curr=new int[MAX_CHARS];
		for(int j=0;j<n;j++) {
			curr[str.charAt(j)]++;
			if(curr[str.charAt(j)]==1)count++;
			if(count == dist) {
				while(curr[str.charAt(start)]>1) {
					if(curr[str.charAt(start)]>1) curr[str.charAt(start)]--;
					start++;
				}
				int lenwindow=j-start+1;
				if(minlen>lenwindow) {
					minlen=lenwindow;
					index=start;
				}
			}
		}
		return str.substring(index, index+minlen);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(findsub(str));
	}

}
