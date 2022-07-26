package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _Demo1 {
public static void main(String args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			String[] s1 = br.readLine().trim().split(" ");
			int n = Integer.parseInt(s1[0]);
			int k = Integer.parseInt(s1[1]);
			
			System.out.println(n+ " "+k);
		}
	}
}
