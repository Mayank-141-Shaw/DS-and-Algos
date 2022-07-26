package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Facedir {
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		String[] res = new String[t];
		
		for(int i=0; i<t; i++) {
			
			int x = Integer.parseInt(br.readLine()) % 4;
			
			if(x==0) res[i] = "North";
			else if(x==1) res[i] = "East";
			else if(x==2) res[i] = "South";
			else res[i] = "West";
			
		}
		
		for(int i=0; i<t; i++) {
			System.out.println(res[i]);
		}
		
		
	}
}
