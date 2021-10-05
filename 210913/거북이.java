import java.util.*;

class Main {
	static int[] dx = {0, -1, 0, 1};
	static int[] dy = {1, 0, -1, 0};
	static int d, x, y;
	static int maxX, maxY, minX, minY;
	
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int[][] map = new int[500][500];
        int n = sc.nextInt();
        
        while(n --> 0) {
        	char[] arr = sc.next().toCharArray();
        	d = x = y = 0;
        	maxX = maxY = minX = minY = 0;
        	
        	for(int i = 0; i < arr.length; i++) {
        		char cmd = arr[i];
        		if(cmd == 'F') {
        			x += dx[d];
        			y += dy[d];
        			check();
        			
        		} else if(cmd == 'B') {
        			x -= dx[d];
        			y -= dy[d];
        			check();
        			
        		} else if(cmd == 'L') {
        			d = d - 1 == -1 ? 3 : d - 1;
        			
        		} else
        			d = d + 1 == 4 ? 0 : d + 1;
        		
        	}
        	
        	System.out.println(Math.abs(maxX - minX) * Math.abs(maxY - minY));
        }
    }

	private static void check() {
		maxX = Math.max(maxX, x);
		maxY = Math.max(maxY, y);
		minX = Math.min(minX, x);
		minY = Math.min(minY, y);
		
	}
}
