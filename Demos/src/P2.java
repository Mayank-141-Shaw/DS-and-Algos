import java.util.Scanner;
public class P2 {
	public static void main(String args[]) {
		// buzz number ends with 7 or is divisible by 7
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter p and q values: ");
		int p = sc.nextInt();
		int q = sc.nextInt();
		System.out.println("The buzz numbers are: ");
		for(int i=p; i<=q; i++) {
			if(i%7 == 0 || i%10 == 7) {
				System.out.print(i+" ");
			}
		}
	}
}
