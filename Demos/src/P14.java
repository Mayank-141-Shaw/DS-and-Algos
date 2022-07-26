import java.util.Scanner;
public class P14 {
	public static int isHappyNumber(int num) {
		int dig = 0, s=0;
		while(num>0) {
			dig = num%10;
			s += (dig*dig);
			num /= 10;
		}
		return s;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		// check for disarium
		
		int copy = num, d = 0, sum=0;
		String s = Integer.toString(num);
		int len = s.length();
		while(copy>0) {
			d = copy % 10;
			sum = sum + (int)Math.pow(d, len);
			len--;
			copy /= 10;
		}
		if(sum == num) System.out.println("Its a disarium number");
		else System.out.println("Not a disarium number");
		
		
		// check for happy number
		int res = num;
		while(res!=1 && res !=4) res = isHappyNumber(res);
		
		if(res == 1) System.out.println(num + " is a Happy number");
		else if(res == 4) System.out.println(num+" is not a Happy number");
	}
}
