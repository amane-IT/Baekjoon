import java.util.*;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int r = sc.nextInt();
    	int c = sc.nextInt();
    	int q = sc.nextInt();
    	int[][] map = new int[r + 1][c + 1];
    	
    	for(int i = 1; i <= r; i++) {
    		int sum = 0;
    		for(int j = 1; j <= c; j++) {
    			sum += sc.nextInt();
    			map[i][j] = sum;
    		}
    	}
    	
    	while(q --> 0) {
    		int r1 = sc.nextInt();
    		int c1 = sc.nextInt();
    		int r2 = sc.nextInt();
    		int c2 = sc.nextInt();
    		
    		int sum = 0;
    		for(int i = r1; i <= r2; i++) {
    			int num = map[i][c2] - map[i][c1 - 1];
    			//System.out.print(num + "\t");
    			sum += num;
    		}
    		//System.out.println();
    		int div = (r2 - r1 + 1) * (c2 - c1 + 1);
    		//System.out.println(div);
    		int ans = sum / div;
    		
    		System.out.println(ans);
    		
    	}
    	
    	
    	
	}
}
