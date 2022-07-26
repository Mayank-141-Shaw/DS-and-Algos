package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Gene01 {
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().trim().split(" ");
		if( s[0].equals(s[1]) ) System.out.println(s[0]);
		else {
			HashMap<String, Integer> map = new HashMap<>();
			map.put("R", 0);
			map.put("B", 1);
			map.put("G", 2);
			
			if(map.get(s[0]) < map.get(s[1])) System.out.println(s[0]);
			else System.out.println(s[1]);
		}
	}
}
