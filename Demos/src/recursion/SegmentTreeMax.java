package recursion;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SegmentTreeMax {
	
	public static int[] buildTree(int[] a) {
		int n = a.length;
		int[] tree = new int[2*n];
		
		for(int i=0; i<n; i++) {
			tree[i+n] = a[i];
		}
		
		for(int i=n-1; i>0; i--) {
			tree[i] = Math.max(tree[i<<1], tree[i<<1 | 1]);
		}
		
		return tree;
	}
	
	public static int query(int[] tree, int l, int r, int n) {
		int max = Integer.MIN_VALUE;
		
		for(l+=n, r+=n; l<r; l>>=1, r>>=1) {
			if((l&1) > 0) { 
				max = Math.max(tree[l++], max);
			}
			if((r&1) > 0) {
				max = Math.max(tree[--r], max);
			}
		}
		
		return max;
	}

	public static void update(int[] tree, int val, int p, int n) {
		p+=n;
		tree[p] = val;
		
		for(int i=p; i>0; i>>=1) {
			tree[i>>1] = Math.max(tree[i], tree[i^1]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 5, 10, 2, 4, 7, 1, 3 };
		int[] tree = buildTree(a);
		
		String res = Arrays
				.stream(tree)
				.mapToObj(Integer::toString)
				.collect(Collectors.joining(","));
		
		System.out.println(res);
		
		System.out.println("MAx btw 1 and 4 is " +query(tree, 1, 4+1, a.length) );
		
		update(tree, 200, 2, a.length);
		
		res = Arrays
				.stream(tree)
				.mapToObj(Integer::toString)
				.collect(Collectors.joining(","));
		
		System.out.println(res);
	}

}
