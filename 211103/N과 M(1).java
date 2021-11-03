import java.util.*;

class Main {
	static int[] arr;
	static boolean[] check;
	static int n, m;
	
	public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	n = sc.nextInt();
    	m = sc.nextInt();
    	
    	arr = new int[m];
    	check = new boolean[n + 1];
    	
    	dfs(0);
    }
	
	static void dfs(int depth) {
		if(depth == m) {
			for(int i = 0; i < m; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 1; i <= n; i++) {
			if(!check[i]) {
				check[i] = true;
				arr[depth] = i;
				dfs(depth + 1);
				check[i] = false;
			}
		}
	}
    
    
}
