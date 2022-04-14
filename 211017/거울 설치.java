import java.util.*;

class 거울설치 {
	
	static class Mirror{
		int row, col, dir, cnt;
		
		Mirror(int row, int col, int dir, int cnt){
			this.row = row;
			this.col = col;
			this.dir = dir;
			this.cnt = cnt;
		}
	}
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	char[][] map = new char[n][n];
    	Queue<Mirror> q = new LinkedList<>();
    
    	int[][][] dp = new int[n][n][4];
    	int[] dx = {1, 0, -1, 0};
    	int[] dy = {0, 1, 0, -1};
    	int ans = Integer.MAX_VALUE;
    	
    	for(int i = 0; i < n; i++) {
    		char[] ch = sc.next().toCharArray();
    		for(int j = 0; j < n; j++) {
    			Arrays.fill(dp[i][j], Integer.MAX_VALUE);
    			map[i][j]= ch[j];
    			if(map[i][j] == '#')
    				q.add(new Mirror(i, j, 0, 0));
    		}
    	}
    	
    	Mirror m = q.poll();
    	map[m.row][m.col] = '&';
    	
    	m = q.poll();
    	for(int i = 0; i < 4; i++) {
    		q.add(new Mirror(m.row, m.col, i, 0));
    	}
    	
    	while(!q.isEmpty()) {
    		m = q.poll();
    		if(dp[m.row][m.col][m.dir] < m.cnt)
    			continue;
    		
    		dp[m.row][m.col][m.dir] = m.cnt;
    		
    		if(map[m.row][m.col] == '&') {
    			ans = Math.min(ans, m.cnt);
    			continue;
    		}
    		
    		if(map[m.row][m.col] == '!') {
    			q.add(new Mirror(m.row, m.col, (m.dir + 3) % 4, m.cnt + 1));
    			q.add(new Mirror(m.row, m.col, (m.dir + 1) % 4, m.cnt + 1));
    		}
    		
    		int mx = m.row + dx[m.dir];
    		int my = m.col + dy[m.dir];
    		
    		if(mx < 0 || mx >= n || my < 0 || my >= n || map[mx][my] == '*') {
    			continue;
    		}
    		
    		q.add(new Mirror(mx, my, m.dir, m.cnt));
    	}
    	
    	System.out.println(ans);
	}
}
