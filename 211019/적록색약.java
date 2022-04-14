import java.util.*;

class 적록색약 {
	static char[][] map;
	static int[][] c, p;
	static int cnt = 0, cnt_p = 0, n;
	static int[] dx = {0, 0, 1, -1};
	static int[] dy = {1, -1, 0, 0};
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	n = sc.nextInt();
    	map = new char[n][n];
    	c = new int[n][n];
    	p = new int[n][n];
    	
    	for(int i = 0; i < n; i++) {
    		String tmp = sc.next();
    		for(int j = 0; j < n; j++) {
    			map[i][j] = tmp.charAt(j);
    		}
    		Arrays.fill(c[i], 0);
    		Arrays.fill(p[i], 0);
    	}
    	
    	for(int i = 0; i < n; i++) {
    		for(int j = 0; j < n; j++) {
    			if(c[i][j] == 0) {
    				cnt++;
    				dfs(i, j, map[i][j], cnt);
    			}
    			
    			if(p[i][j] == 0) {
    				cnt_p++;
    				dfs_p(i, j, map[i][j], cnt_p);
    			}
    		}
    	}
    	
    	System.out.println(cnt + " " + cnt_p);
	}
	
	static void dfs(int x, int y, char color, int num) {
		c[x][y] = num;
		
		for(int i = 0; i < 4; i++) {
			int mx = x + dx[i];
			int my = y + dy[i];
			
			if(mx < 0 || mx >= n || my < 0 || my >= n)
				continue;
			
			if(c[mx][my] != 0)
				continue;
			
			char nextC = map[mx][my];
			
			if(nextC == color) {
				dfs(mx, my, nextC, num);
			}
		}
	}
	
	static void dfs_p(int x, int y, char color, int num) {
		p[x][y] = num;
		
		for(int i = 0; i < 4; i++) {
			int mx = x + dx[i];
			int my = y + dy[i];
			
			if(mx < 0 || mx >= n || my < 0 || my >= n)
				continue;
			
			if(p[mx][my] != 0)
				continue;
			
			char nextC = map[mx][my];
			
			if(nextC == color) {
				dfs_p(mx, my, nextC, num);
			}
			
			else if((color == 'G' && nextC == 'R') || (color == 'R' && nextC == 'G')) {
				dfs_p(mx, my, nextC, num);
			}
		}
	}
}
