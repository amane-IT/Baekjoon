import java.util.*;

class 연산자끼워넣기 {
	static int n;
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	
	static int[] num;
	static int[] operator = new int[4];
	
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	n = sc.nextInt();
    	num = new int[n];
    	
    	for(int i = 0; i < n; i++) {
    		num[i] = sc.nextInt();
    	}
    	
    	for(int i = 0; i < 4; i++) {
    		operator[i] = sc.nextInt();
    	}
    	
    	dfs(num[0], 1);
    	
    	System.out.println(max);
    	System.out.println(min);
    	
    }
    
    static void dfs(int number, int idx) {
    	if(idx == n) {
    		max = Math.max(max, number);
    		min = Math.min(min, number);
    		return;
    	}
    	
    	for(int i = 0; i < 4; i++) {
    		if(operator[i] > 0) {
    			operator[i]--;
    			
    			switch(i) {
    			
    			case 0:
    				dfs(number + num[idx], idx + 1);
    				break;
    			case 1:
    				dfs(number - num[idx], idx + 1);
    				break;
    			case 2:
    				dfs(number * num[idx], idx + 1);
    				break;
    			case 3:
    				dfs(number / num[idx], idx + 1);
    				break;
    				
    			}
    			
    			operator[i]++;
    		}
    	}
    }
    
    
}
