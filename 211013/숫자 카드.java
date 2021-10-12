import java.util.*;

class Main {
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	long[] arr = new long[n];
    	
    	for(int i = 0; i < n; i++) {
    		arr[i] = sc.nextLong();
    	}
    	
    	Arrays.sort(arr);
    	
    	int m = sc.nextInt();
    	StringBuilder sb = new StringBuilder();
    	
    	for(int i = 0; i < m; i++) {
    		long target = sc.nextLong();
    		
    		int left = 0;
    		int right = n - 1;
    		boolean flag = false;
    		
    		while(left <= right) {
    			int mid = (left + right) / 2;
    			
    			if(arr[mid] > target) {
    				right = mid - 1;
    			} else if(arr[mid] < target) {
    				left = mid + 1;
    			} else {
    				flag = true;
    				break;
    			}
    		}
    		
    		if(flag)
    			sb.append("1 ");
    		else
    			sb.append("0 ");
    		
    	}
    	System.out.print(sb);
    	
	}
}
