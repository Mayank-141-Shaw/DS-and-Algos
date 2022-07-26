package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Bmi {
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int[] res = new int[t];
		
		for(int i=0; i<t; i++) {
			String[] s = br.readLine().trim().split(" ");
			int m = Integer.parseInt(s[0]);
			int h = Integer.parseInt(s[1]);
			
			int bmi = (int) (m / (h*h));
			
			if(bmi <= 18) res[i] = 1;
			else if(bmi >= 19 && bmi <= 24) res[i] = 2;
			else if(bmi >= 25 && bmi <= 29) res[i] = 3;
			else res[i] = 4;
		}
		
		for(int i=0; i<t; i++) {
			System.out.println(res[i]);
		}
		
		
	}
}
