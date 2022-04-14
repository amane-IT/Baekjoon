import java.util.*;

class 여행 {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	int k = sc.nextInt();
    	
    	int[][] arr = new int[n + 1][n + 1];
    	
    	for(int[] a : arr) {
    		Arrays.fill(a, -1);
    	}
    	
    	for(int i = 0; i < k; i++) {
    		int start = sc.nextInt();
    		int end = sc.nextInt();
    		int rate = sc.nextInt();
    		
    		if(start > end)
    			continue;
    		
    		arr[start][end] = Math.max(arr[start][end], rate);
    	}
    	
    	int[][] dp = new int[n + 1][m + 1];
    	
    	for(int[] a : dp)
    		Arrays.fill(a, -1);
    	
    	dp[1][1] = 0;
    	
    	for(int i = 1; i < n; i++) {
    		for(int j = 1; j < m; j++) {
    			if(dp[i][j] == -1)
    				continue;
    			
    			for(int next = i + 1; next <= n; next++) {
    				if(arr[i][next] == -1)
    					continue;
    				
    				dp[next][j + 1] = Math.max(dp[next][j + 1], dp[i][j] + arr[i][next]);
    			}
    		}
    		
    	}
    	
    	int max = 0;
    	
    	for(int i = 0; i <= m; i++) {
    		//System.out.print(dp[n][i] + "\t");
    		max = Math.max(max, dp[n][i]);
    	}
    	
    	//System.out.println();
    	System.out.println(max);
    	
	}
}
