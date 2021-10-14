import java.util.*;

class Main {
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int m = sc.nextInt();
    	int n = sc.nextInt();
    	
    	long[] arr = new long[n];
    	
    	for(int i = 0; i < n; i++) {
    		arr[i] = sc.nextLong();
    	}
    	
    	Arrays.sort(arr);
    	
    	long left = 1;
    	long right = arr[n - 1];
    	long answer = 0;
    	
    	while(left <= right) {
    		long mid = (left + right) / 2;
    		long cnt = 0;
    		
    		for(int i = 0; i < n; i++) {
    			cnt += arr[i] / mid;
    		}
    		
    		if(cnt >= m) {
    			answer = mid;
    			left = mid + 1;
    		}
    		else {
    			right = mid - 1;
    		}
    		
    	}
    	
    	System.out.print(answer);
    	
	}
}
