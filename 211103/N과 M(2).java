import java.util.*;

class N과M2{
	static int[] arr;
	static int n, m;
	
	public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	n = sc.nextInt();
    	m = sc.nextInt();
    	
    	arr = new int[m];
    	
    	dfs(1, 0);
    }
	
	static void dfs(int idx, int depth) {
		if(depth == m) {
			for(int i = 0; i < m; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = idx; i <= n; i++) {
			arr[depth] = i;
			dfs(i + 1, depth + 1);
		}
	}
    
    
}
