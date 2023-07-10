package recursion;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SegmentTree {
	
	static final int MAX_SIZE = 100000;
	
	static int[] buildTree(int[] a) {
		int n = a.length;
		int[] tree = new int[2*n];
		
		for(int i=0; i<n; i++) {
			tree[i+n] = a[i];
		}
		
		for(int i=n-1; i>0; i--) {
			tree[i] = tree[i<<1] + tree[i<<1 | 1];
		}
		
		return tree;
	}
	
	static void update(int[] tree, int val, int p, int n) {
		p += n;
		tree[p] = val;
		
		// find its sibling and update its parent
		// i^1 flips the last bit and give the alternate sibling of the ith node
		for(int i=p; i>0; i=i>>1) {
			tree[i>>1] = tree[i] + tree[i^1];
		}
	}
	
	static int sum(int[] tree, int l, int r, int n) {
		int res = 0;
		
		for(l+=n, r+=n; l<r; l>>=1, r>>=1) {
			if((l&1) > 0) {
				res += tree[l++];
			}
			if((r&1) > 0) {
				res += tree[--r];
			}
		}
		
		return res;
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
		
		update(tree, 200, 2, a.length);
		
		System.out.println("After update");
		res = Arrays
				.stream(tree)
				.mapToObj(Integer::toString)
				.collect(Collectors.joining(","));
		
		System.out.println(res);
		
		// 0 indexed sum
		int sum = sum(tree, 1, 4+1, a.length);
		System.out.println("Sum of range 1 to 4 is = "+sum);
	}
	

}
