/* dfs로 풀었지만 시간 초과 */

import java.util.*;

class Main {
	static int max = 0;
	static char[] arr;
	static boolean[] check;
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int k = sc.nextInt();
    	arr = sc.next().toCharArray();
    	check = new boolean[n];
    	
    	dfs(0, k);
    	
    	System.out.print(max);
    	
	}
	
	static void dfs(int depth, int target) {
		if(depth == target) {
			String tmp = "";
			
			for(int i = 0; i < arr.length; i++) {
				if(!check[i])
					tmp += arr[i];
			}
			
			max = Math.max(max, Integer.parseInt(tmp));
			return;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(!check[i]) {
				check[i] = true;
				dfs(depth + 1, target);
				check[i] = false;
			}
		}
	}
}
