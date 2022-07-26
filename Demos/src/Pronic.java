import java.util.Scanner;
public class Pronic {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		boolean ans = false;
		
		for(int i=0; i<num; i++) {
			if(i*(i+1) == num) {
				ans = true;
				break;
			}
		}
		
		if(ans) System.out.println(num +" is a Pronic number");
		else System.out.println(num + " is not a Pronic Number");
	}
}
