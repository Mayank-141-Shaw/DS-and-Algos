package codechef;

import java.io.IOException;
import java.io.*;

public class SupChef {
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		String[] res = new String[t];
		
		for(int i=0; i<t; i++) {
			String[] mnk = br.readLine().trim().split(" ");
			int m = Integer.parseInt(mnk[0]);
			int n = Integer.parseInt(mnk[1]);
			int k = Integer.parseInt(mnk[2]);
			
			if (k*n < m) res[i] = "YES";
			else res[i] = "NO";
		
		}
		
		for(int i=0; i<t; i++) {
			System.out.println(res[i]);
		}
	}
}
