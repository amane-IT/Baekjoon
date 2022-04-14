import java.util.*;

class 곱셈 {
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	long a = sc.nextLong();
    	long b = sc.nextLong();
    	long c = sc.nextLong();
    	
    	
    	System.out.print(pow(a, b, c) % c);
    	
	}
	
	static long pow(long a, long b, long c) {
		if(b == 0)
			return 1;
		else if (b == 1)
			return a;
		else if (b % 2 == 0) {
			long n = pow(a, b / 2, c) % c;
			return (n * n) % c;
		} else {
			long n = pow(a, b / 2, c) % c;
			return (((n * n) % c) * a) % c;
		}
	}
}
