package recursion;

public class MergeSort {
	
	public static void main(String args[]) throws Exception{
		
	}
	
	static void mergeSort(int[] arr, int l, int r) {
		// base case
		if(l < r) {
			int mid = r - (r-l)/2;
			
			// sort left part
			mergeSort( arr, l, mid );
			// sort right part
			mergeSort( arr, mid+1, r );
			
			// merge the arrays
			merge(arr, l, mid, r);
		}
	}
	
	static void merge(int[] arr, int l, int mid, int r) {
		
	}
	
}
