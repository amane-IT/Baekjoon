import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        int[][] house = new int[15][15];
        
        for(int i = 0; i < 15; i++) {
        	house[i][1] = 1;
        	house[0][i] = i;
        }
        
        for(int i = 1; i < 15; i++) {
        	for(int j = 2; j < 15; j++) {
        		house[i][j] = house[i - 1][j] + house[i][j - 1];
        	}
        }
        
        while(T --> 0) {
        	int k = sc.nextInt();
        	int n = sc.nextInt();
        	
        	System.out.println(house[k][n]);
        }
    }
}
