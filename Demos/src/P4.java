import java.util.Scanner;
public class P4 {
	public static void main(String args[]) {
		System.out.println("Enter 2 numbers to find GCD:");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		// m must be greater or equal to n
		if(m<n) {
			int temp = m;
			m=n;
			n = temp;
		}
		while(n!=0) {
			int t = n;
			n = m%n;
			m = t;
		}
		System.out.println("GCD is : "+m);
	}
}
