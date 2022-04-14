import java.util.*;

class 입국심사 {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	long m = sc.nextLong();
    	long[] arr = new long[n];
    	long left = 1, right = 0, answer = Long.MAX_VALUE;
    	long sum = 0;
    	
    	for(int i = 0; i < n; i++) {
    		arr[i] = sc.nextLong();
    		right = Math.max(right, arr[i]);
    	}
    	
    	Arrays.sort(arr);
    	right *= m;
    	
    	while(left <= right) {
    		long mid = (left + right) / 2;
    		
    		sum = 0;
    		
    		for(int i = 0; i < n; i++) {
    			sum += mid / arr[i];
    			if(sum >= m)
    				break;
    		}
    		
    		if(m > sum)
    			left = mid + 1;
    		else {
    			right = mid - 1;
    		}
    	}
    	
    	System.out.println(left);
    	
	}
}
