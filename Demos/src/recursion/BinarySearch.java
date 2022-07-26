package recursion;

public class BinarySearch {
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[] = {1, 2,3,4,5,6,7,8,9,23, 67, 189, 200};
		System.out.println( bin(arr, 0, arr.length - 1, 200) );
	}
	
	static boolean bin(int[] arr, int s, int e, int key){
	  if(s>e) return false;
	  
	  int mid = e - (e-s)/2;
	  if(arr[mid] == key) return true;
	  
	  if(arr[mid] < key) return bin(arr, mid+1, e, key);
	  else return bin(arr, s, mid-1, key);
	}
}
