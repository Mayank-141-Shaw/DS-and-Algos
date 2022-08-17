package recursion;

public class SquareRoot_B_S {
	
	public static void main(String args[]) {
		long val = 146010011l;
		
		double ans = (double)root(val);
		int preci = 10;
		
		// precision loop
		for(int i=1; i<=preci; i++) {
			ans = precision(ans, Math.pow(10, -i), (double)val);
		}
		
		System.out.println( ans );
	}
	
	static long root(long num) {
		
		long ans = 0;
		
		long s=0, e=num;
		while(s<=e) {
			long mid = e-(e-s)/2;
			if( mid*mid < num ) {
				ans = mid;
				s = mid+1;
			}else if( mid*mid > num ) {
				e = mid-1;
			}else {
				ans = mid;
				break;
			}
		}
		
		return ans;
	}
	
	static double precision(double num, double precision, double x) {
		double ans = num;
		
		while((ans * ans) < x) {
			if( Math.pow(ans+precision, 2) > x ) break;
			ans += precision;
		}
		
		return ans;
	}
}
