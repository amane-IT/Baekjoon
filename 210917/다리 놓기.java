import java.util.*;

class Main {
	
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t --> 0) {
        	int n = sc.nextInt();
        	int m = sc.nextInt();
        	
        	int dp[][] = new int[n + 1][m + 1];
        	
        	for(int i = 2; i <= n; i++)
        		dp[i][1] = 0;
        	
        	for(int i = 1; i <= m; i++)
        		dp[1][i] = i;
        	
        	for(int i = 2; i <= n; i++) {
        		for(int j = 2; j <= m; j++) {
        			dp[i][j] = dp[i][j - 1] + dp[i - 1][j - 1];
        		}
        	}
        	
        	System.out.println(dp[n][m]);
        }
        
        
    }
}
