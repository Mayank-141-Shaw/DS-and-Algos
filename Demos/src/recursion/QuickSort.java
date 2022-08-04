package recursion;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {7, 6, 2, 9, 10, 4, 15, 1, 8};
		int n = arr.length;
		
		quicksort(arr, 0, n-1);
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	static void quicksort(int[] arr, int s, int e) {
		// base case
		if(s>=e) return;
		
		// find pivot
		int pivot = partition(arr, s, e);
		
		// sort the left part
		quicksort(arr, s, pivot-1);
		
		// sort the right part
		quicksort(arr, pivot+1, e);
	}
	
	
	static int partition(int[] arr, int s, int e) {
		// choose a pivot value
		int pivot = arr[s];
		
		// count values smaller than pivot
		int count = 0;
		for(int i=s; i<=e; i++) {
			if(arr[i] < pivot) count++;
		}
		
		//get pivot index to swap
		int pIndex = s+count;
		arr[s] = arr[pIndex];
		arr[pIndex] = pivot;
		
		// now we swap all lower and upper values in their subarrays
		int i=s, j=e;
		
		while(i<pIndex && j>pIndex) {
			if(arr[i] > pivot && arr[j] < pivot) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				i++;
				j--;
			}
			else if(arr[i] < pivot) i++;
			else if(arr[j] > pivot) j--;
		}
		
		return pIndex;
	}

}
