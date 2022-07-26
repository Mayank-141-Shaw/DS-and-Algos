package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ccook {
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int a,b,c,d,e;
		
		String[] res = new String[n];
		
		for(int i=0; i<n; i++) {
			String[] s = br.readLine().trim().split(" ");
			
			int sum = Integer.parseInt(s[0]) + Integer.parseInt(s[1])
						+ Integer.parseInt(s[2]) + Integer.parseInt(s[3]) + Integer.parseInt(s[4]);
			if(sum ==0) res[i] = "Beginner";
			else if(sum == 1) res[i] = "Junior Developer";
			else if(sum == 2) res[i] = "Middle Developer";
			else if(sum == 3) res[i] = "Senior Developer";
			else if(sum == 4) res[i] = "Hacker";
			else res[i] = "Jeff Dean";
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(res[i]);
		}
		
		
	}
}
