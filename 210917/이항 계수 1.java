import java.util.*;

class 이항계수1 {
	
	/*
	 * 이항계수 = n! / ((n - k)! * k!)
	 */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        System.out.println(factorial(n) / (factorial(n - k) * factorial(k)));
    }
    
    static int factorial(int n) {
    	if(n <= 1)
    		return 1;
    	
    	return n * factorial(n - 1);
    }
}
