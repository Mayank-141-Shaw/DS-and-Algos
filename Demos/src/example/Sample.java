package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Sample {
	
	public static void main(String args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		int[] res = new int[t];
		for(int i=0; i<t; i++) {
			int ct=0;
			
			String[] s1 = br.readLine().trim().split(" ");
			PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.naturalOrder());
			
			for(int j=0; j<s1.length; j++) {
				q.add(Integer.parseInt(s1[j]));
			}
			
			int k = 1;
			while(!q.isEmpty()) {
				ct += q.poll() * k;
				k++;
			}
			
			res[i] = t;
			ct = 0;
		}
		
		for(int i=0; i<t; i++) {
			System.out.println(res[i]);
		}
	}
}
