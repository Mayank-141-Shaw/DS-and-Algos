package recursion;

public class StringReverse {
	
	public static void main(String args[]) throws Exception{
		char[] arr = "Hello World".toCharArray();
		
		System.out.println(reverse(arr, 0, arr.length - 1));
	}
	
	static String reverse(char[] str, int i, int j) {
		if(i >= j) {
			return new String(str);
		}
		char temp = str[i];
		str[i] = str[j];
		str[j] = temp;
		
		return reverse(str, i+1, j-1);
	}
}
