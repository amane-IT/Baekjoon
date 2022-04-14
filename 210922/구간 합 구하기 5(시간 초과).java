import java.util.*;

class 구간합구하기5_시간초과 {
	
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	int[][] map = new int[n][n];
    	
    	for(int i = 0; i < n; i++) {
    		for(int j = 0; j < n; j++) {
    			map[i][j] = sc.nextInt();
    		}
    	}
    	
    	
    	while(m --> 0) {
    		int x1 = sc.nextInt() - 1;
    		int y1 = sc.nextInt() - 1;
    		int x2 = sc.nextInt() - 1;
    		int y2 = sc.nextInt() - 1;
    		
    		int result = 0;
    		
    		for(int i = x1; i <= x2; i++) {
    			int sum = 0;
    			for(int j = y1; j <= y2; j++) {
    				sum += map[i][j];
    			}
    			result += sum;
    		}
    		System.out.println(result);
    	}
    }
}
