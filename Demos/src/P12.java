import java.util.Scanner;
public class P12 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms in the series");
		int n = sc.nextInt();
		String s = "";
		if(n<=0) System.out.println("Number not valid");
		else{
			System.out.println("The series is: ");
			for(int i = 1; i<=n; i++) {
				s = s+"1";
				System.out.println(s);
			}
		}
	}
}
