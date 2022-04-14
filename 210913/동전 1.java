import java.util.*;

class 동전1 {
	
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] arr = new int[n + 1];
        int[] dp = new int[k + 1];
        dp[0] = 1;
        
        for(int i = 1; i <= n; i++) {
        	arr[i] = sc.nextInt();
        	for(int j = arr[i]; j <= k; j++) {
        		dp[j] += dp[j - arr[i]];
        	}
        }
        
        System.out.println(dp[k]);
	}
}
