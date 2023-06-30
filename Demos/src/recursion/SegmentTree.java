package recursion;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SegmentTree {
	
	int query(int[] tree, int a, int b) {
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] arr = { 15, 4, 2, 7, 5 };
		int[] sumtree = new int[2*n];
		int[] maxtree = new int[2*n];
		
		// copy into  sumtree
		for(int i=0; i<n; i++) {
			sumtree[ i+n ] = arr[i];
			maxtree[ i+n ] = arr[i];
		}
		
		// build sum tree;
		for(int i=sumtree.length-1; i>0; i--) {
			int parent = i>>1;
			sumtree[parent] += sumtree[i];
		}
		
		// build max tree
		for(int i=maxtree.length-1; i>0; i--) {
			int parent = i>>1;
			maxtree[parent] = Math.max(maxtree[parent], maxtree[i]);
		}
		
		System.out.println(Arrays
				.stream(sumtree)
				.mapToObj( String::valueOf )
				.collect(
						Collectors
						.joining(",")
						)
				);
		System.out.println();
		
		System.out.println(Arrays
				.stream(maxtree)
				.mapToObj( String::valueOf )
				.collect(
						Collectors
						.joining(",")
						)
				);
		System.out.println();
		// modify one element
		modify(sumtree, 20, 2+n);
		
		System.out.println(Arrays
				.stream(sumtree)
				.mapToObj( String::valueOf )
				.collect(
						Collectors
						.joining(",")
						)
				);
	}
	
	static void modifyMaxTree(int[] tree, int val, int pos) {
		int prev = tree[pos];
		tree[pos] = val;
		
	}
	
	static void modify(int[] tree, int val, int pos) {
		int prev = tree[pos];
		tree[pos] = val;
		int change = val - prev;
		pos /= 2;
		// add this change to all the parents
		while(pos>0) {
			tree[pos] += change;
			pos = pos/2;
		}
		
		tree[0] += change;
	}

}
