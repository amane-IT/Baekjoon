import java.util.*;

class 동전0 {
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int k = sc.nextInt();
    	int[] coin = new int[n];
    	
    	for(int i = 0; i < n; i++) {
    		coin[i] = sc.nextInt();
    	}
    	
    	int cnt = 0;
    	
    	for(int i = n - 1; i >= 0; i--) {
    		if(coin[i] <= k) {
    			cnt += k / coin[i];
    			k = k % coin[i];
    		}
    	}
    	
    	System.out.println(cnt);
	}
}
