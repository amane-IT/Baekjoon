import java.util.*;

class 구간합구하기5_성공 {
	
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	
    	int[][] map = new int[n + 1][n + 1];
    	int[][] dp = new int[n + 1][n + 1];
    	
    	int num = 0;
    	
    	for(int i = 1; i <= n; i++) {
    		for(int j = 1; j <= n; j++) {
    			map[i][j] = sc.nextInt();
    		}
    	}
    	
    	for(int i = 1; i <= n; i++) {
    		for(int j = 1; j <= n; j++) {
    			dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + map[i][j];
    		}
    	}
    	
    	
    	while(m --> 0) {
    		int x1 = sc.nextInt();
    		int y1 = sc.nextInt();
    		int x2 = sc.nextInt();
    		int y2 = sc.nextInt();

    		int sum = dp[x2][y2] - dp[x2][y1 - 1] - dp[x1 - 1][y2] + dp[x1 - 1][y1 - 1];
    		System.out.println(sum);
    	}
    }
}
