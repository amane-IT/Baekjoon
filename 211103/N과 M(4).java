import java.util.*;

class N과M4_2 {
	static int[] arr;
	static int n, m;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	n = sc.nextInt();
    	m = sc.nextInt();
    	
    	arr = new int[m];
    	
    	dfs(1, 0);
    	System.out.print(sb);
    }
	
	static void dfs(int idx, int depth) {
		if(depth == m) {
			for(int i = 0; i < m; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = idx; i <= n; i++) {
			arr[depth] = i;
			dfs(i, depth + 1);
		}
	}
}
