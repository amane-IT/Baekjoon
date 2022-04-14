import java.util.*;

class BOJ_123더하기 {
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int t = sc.nextInt();
    	int[] dp = new int[11];
    	
    	dp[1] = 1;
    	dp[2] = 2;
    	dp[3] = 4;
    	
    	for(int i = 4; i < 11; i++) {
    		dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
    	}
    	
    	while(t --> 0) {
    		int num = sc.nextInt();
    		
    		System.out.println(dp[num]);
    	}
    	
	}
}
