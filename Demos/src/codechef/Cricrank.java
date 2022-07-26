package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cricrank {
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		int r1,r2,w1,w2,c1,c2;
		int A=0,B=0;
		
		String[] res = new String[t];
		
		for(int i=0; i<t; i++) {
			String[] s = br.readLine().trim().split(" ");
			
			r1 = Integer.parseInt(s[0]);
			w1 = Integer.parseInt(s[1]);
			c1 = Integer.parseInt(s[2]);
			
			s = br.readLine().trim().split(" ");
			
			r2 = Integer.parseInt(s[0]);
			w2 = Integer.parseInt(s[1]);
			c2 = Integer.parseInt(s[2]);
			
			if(r1-r2 > 0) A++;
			else B++;
			if(w1-w2 > 0) A++;
			else B++;
			if(c1-c2 > 0) A++;
			else B++;
			
			if(A > B) res[i] = "A";
			else res[i] = "B";
			
			A=0;
			B=0;
		}
		
		for(int i=0; i<t; i++) {
			System.out.println(res[i]);
		}
		
		
	}
}
