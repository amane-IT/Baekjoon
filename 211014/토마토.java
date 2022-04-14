import java.util.*;

class 토마토 {
	static class Dot{
		int x, y;
		
		public Dot(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	static Queue<Dot> q = new LinkedList<>();
	static int m, n;
	static int[][] map;
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {1, -1, 0, 0};
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	m = sc.nextInt();
    	n = sc.nextInt();
    	
    	map = new int[n][m];
    	
    	for(int i = 0; i < n; i++) {
    		for(int j = 0; j < m; j++) {
    			map[i][j] = sc.nextInt();
    			if(map[i][j] == 1)
    				q.add(new Dot(i, j));
    		}
    	}
    	
    	while(!q.isEmpty()) {
    		Dot dot = q.poll();
    		
    		for(int i = 0; i < 4; i++) {
    			int x = dot.x + dx[i];
    			int y = dot.y + dy[i];
    			
    			if(x >= 0 && y >= 0 && x < n && y < m) {
    				if(map[x][y] == 0) {
    					map[x][y] = map[dot.x][dot.y] + 1;
    					q.add(new Dot(x, y));
    				}
    			}
    		}
    	}
    	
    	int max = 0;
    	
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(map[i][j] == 0) {
					System.out.println(-1);
					return;
				}
				max = Math.max(max, map[i][j]);
			}
		}
		System.out.println(max - 1);
	}
}
