import java.util.*;

class N과M4 {
	
	static int n, k;
	static int[] arr;
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	n = sc.nextInt();
    	k = sc.nextInt();
    	arr = new int[k];
    	
    	dfs(1, 0);
    }
    
    static void dfs(int idx, int depth) {
    	if(depth == k) {
    		for(int i = 0; i < k; i++) {
    			System.out.print(arr[i] + " ");
    		}
    		
    		System.out.println();
    		return;
    	}
    	
    	for(int i = idx; i <= n; i++) {
    		arr[depth] = i;
    		dfs(i, depth + 1);
    	}
    }
}
