package recursion;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String args[]) throws Exception{
		
		int[] arr = { 4, 12, 78, 9, 2, 45, 10, 3 };
		
		sort(arr, arr.length);
		
		Arrays.stream(arr).forEach( val -> System.out.print(val + " ") );
		
	}
	
	static void sort( int[] arr, int n ) {
		// base
		if(n==0 || n==1) return;
		
		// else
		for(int i=0; i<n-1; i++) {
			if(arr[i] > arr[i+1]) {
				swap(arr, i, i+1);
			}
		}
		
		// after sorting to the edge we now ignore it and go till n-1 size
		sort(arr, n-1);
	}
	
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
