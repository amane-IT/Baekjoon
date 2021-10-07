import java.util.*;

class Main {
	static int n;
	static int max = 0;
	
	static int[] direction;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	
	static int[][] map, copy;
	static boolean[][] check;
	
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        map = new int[n][n];
        direction = new int[5];
        
        for(int i = 0; i < n; i++) {
        	for(int j = 0; j < n; j++) {
        		map[i][j] = sc.nextInt();
        	}
        }
        
        dfs(0, 5);
        System.out.println(max);
    }
    
    static void dfs(int start, int end) {
    	if(start == end) {
    		confirm();
    		return;
    	}
    	
    	for(int i = 0; i < 4; i++) {
    		direction[start] = i;
    		dfs(start + 1, end);
    	}
    }
    
    static void confirm() {
    	copy = new int[n][n];
    	
    	for(int i = 0; i < n; i++) {
    		copy[i] = map[i].clone();
    	}
    	
    	for(int i = 0; i < 5; i++) {
    		check = new boolean[n][n];
    		
    		if(direction[i] == 0) {
    			for(int j = 0; j < n; j++) {
    				for(int k = 0; k < n; k++) {
    					move(j, k, direction[i]);
    				}
    			}
    		} else if(direction[i] == 1) {
    			for(int j = n - 1; j >= 0; j--) {
    				for(int k = 0; k < n ; k++) {
    					move(j, k, direction[i]);
    				}
    			}
    		} else if(direction[i] == 2) {
    			for(int j = n - 1; j >= 0; j--) {
    				for(int k = 0; k < n; k++) {
    					move(k, j, direction[i]);
    				}
    			}
    		} else {
    			for(int j = 0; j < n; j++) {
    				for(int k = 0; k < n; k++) {
    					move(k, j, direction[i]);
    				}
    			}
    		}
    	}
    	
    	for(int i = 0; i < n; i++) {
    		for(int j = 0; j < n; j++) {
    			max = Math.max(max, copy[i][j]);
    		}
    	}
    }
    
    static void move(int i, int j, int d) {
    	if(copy[i][j] == 0)
    		return;
    	
    	while(true) {
    		int mx = i + dx[d];
    		int my = j + dy[d];
    		
    		if(mx < 0 || my < 0 || mx > n - 1 || my > n - 1)
    			return;
    		
    		if(check[mx][my])
    			return;
    		
    		
    		if(copy[mx][my] == copy[i][j]) {
    			check[mx][my] = true;
    			copy[mx][my] *= 2;
    			copy[i][j] = 0;
    			return;
    			
    		} else if(copy[mx][my] != 0) {
    			return;
    		}
    		
    		copy[mx][my] = copy[i][j];
    		copy[i][j] = 0;
    		i = mx;
    		j = my;
    	}
    }
}
