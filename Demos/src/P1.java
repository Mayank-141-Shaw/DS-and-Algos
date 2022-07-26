
public class P1 {
	public static void main(String args[]) {
		int i, start = 2;
		// get first 9 prime numbers
		int prime[] = {3,5,7,11,13,17,19,23,29};
		//print first number
		System.out.print(start+" ");
		for(i=0; i<9; i++) {
			System.out.print(( start=start+prime[i] ) + " ");
		}
	}
}
