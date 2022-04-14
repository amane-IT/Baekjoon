import java.util.*;

class 골드바흐의추측 {
	static boolean[] check;
	static final int MAX = 1000000;
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	boolean[] isPrime = new boolean[MAX + 1];
    	
    	for(int i = 2; i <= MAX; i++) {
    		isPrime[i] = true;
    	}
    	
    	for(int i = 2; i <= MAX; i++) {
    		for(int j = i * 2; j <= MAX; j += i) {
    			if(!isPrime[j])
    				continue;
    			isPrime[j] = false;
    		}
    	}
    	
    	while(true) {
    		int n = sc.nextInt();
    		boolean flag = false;
    		
    		if(n == 0)
    			break;
    		
    		for(int i = 2; i <= n/2; i++) {
    			if(isPrime[i] && isPrime[n - i]) {
    				System.out.println(n + " = " + i + " + " + (n - i));
    				flag = true;
    				break;
    			}
    		}
    		
    		if(!flag)
    			System.out.println("Goldbach's conjecture is wrong.");
    	}
	}
}
