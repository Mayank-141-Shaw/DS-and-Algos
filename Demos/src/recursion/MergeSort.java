package recursion;

import java.util.Arrays;

public class MergeSort {
	
	public static void main(String args[]) throws Exception{
		int[] arr = { 45, 78, 21, 9, 34, 2, 19, 90, 8, 24, 21 };
		
		mergeSort(arr, 0, arr.length - 1);
		
		Arrays.stream(arr).forEach(val -> System.out.print(val + " "));
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
		// size of two subarras
		int n1 = mid - l + 1;
		int n2 = r - mid;
		
		// two temp subarrays
		int[] a = new int[n1];
		int[] b = new int[n2];
		
		// copy values from the original arrays in these two
		for(int i=0; i<n1; i++) a[i] = arr[l+i];
		for(int i=0; i<n2; i++) b[i] = arr[mid+1+i];
		
		// loop through both the temp arrays 
		// and put them into the original array
		int i=0, j=0, k=l;
		while(i<n1 && j<n2) {
			if(a[i] < b[j]) {
				arr[k] = a[i];
				k++;
				i++;
			}else {
				arr[k] = b[j];
				k++;
				i++;
			}
		}
		
		// check if any other is remaining
		while(i<n1) {
			arr[k] = a[i];
			k++;
			i++;
		}
		
		while(j<n2) {
			arr[k] = b[j];
			k++;
			j++;
		}
	}
	
}
