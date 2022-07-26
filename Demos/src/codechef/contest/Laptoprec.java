package codechef.contest;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Laptoprec {
	
	public static void main(String args[]) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		
		
		while(t-- > 0) {
			
			int n = sc.nextInt();
			int x;
			
			for(int i=1; i<=10; i++) {
				map.put(i, 0);
			}
			
			for(int i=0; i<n; i++) {
				x = sc.nextInt();
				map.put(x, map.get(x) + 1);
			}
			
			int confusion = 0;
			int max = map.get(1);
			int maxKey = 1;
			
			Iterator<Entry<Integer, Integer>> iter = map.entrySet().iterator();
			while(iter.hasNext()) {
				Entry<Integer, Integer> entry = iter.next();
				if(entry.getValue() > max) {
					maxKey = entry.getKey();
					max = entry.getValue();
				}
			}
			
			final int _max = max;
			
//			iter = map.entrySet().iterator();
//			while(iter.hasNext()) {
//				Entry<Integer, Integer> entry = iter.next();
//				if(entry.getValue() == max) {
//					confusion++;
//				}
//			}
			
			confusion = (int) map.entrySet().stream().filter(entry -> entry.getValue() == _max).count();
			
			if(confusion > 1) {
				System.out.println("CONFUSED");
			}
			else {
				System.out.println(maxKey);
			}
			
		}
	}
}
