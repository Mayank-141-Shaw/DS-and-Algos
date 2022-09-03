package recursion;

import java.util.Stack;

public class PowerSet {
	public static void main(String args[]) {
		char arr[] = {'e', '6', 'x', 'm', 'w'};
//		Stack<Integer> cur = new Stack<>();
//		solve(arr, cur, 0);
		
		bitMasked(arr);
	}
	
	static void solve(char[] arr, Stack<Character> cur, int index) {
		// base 
		if(index >= arr.length) {
			cur.stream().forEach( item -> System.out.print(item+" ") );
			System.out.println();
			return;
		}
		
		// exclude
		solve(arr, cur, index+1);
		
		// include
		cur.push( arr[index] );
		solve(arr, cur, index+1);
		cur.pop();
	}
	
	
	static void bitMasked(char[] arr) {
		long size = arr.length;
		size = (long)Math.pow(2, size);
		
		// we loop till 2^n - 1 times
		for(int i=0; i<size; i++) {
			// bit msaking for each bit of the current number
			// each num represents each state of combination like 5 -> 101 -> {1,3}
			
			// bit masking -> current number & (1 shifted j times to get the jth bit) 
			// and check if that bit is 0 or 1
			for(int j=0; j<arr.length; j++) {
				if( (i & (1 << j)) > 0) System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
	}
	
}
