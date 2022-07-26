package codechef;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Savkono {
	
	public static void main(String args[]) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			long z = sc.nextLong();
			
			long res = 0;
			
			PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
			for(int i=0; i<n; i++) {
				q.add(sc.nextInt());
			}
			
			while(q.peek() > 0 && z > 0) {
				int cur = q.poll();
				z = z - cur;
				res++;
				cur = cur /2;
				q.add(cur);
			}
			
			if(z > 0) System.out.println("Evacuate");
			else System.out.println(res);
			
			
		}
	}
}
