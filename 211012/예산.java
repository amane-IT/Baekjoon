import java.util.*;

class 예산 {
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int[] arr = new int[n];
    	long re = 0;
    	
    	for(int i = 0; i < n; i++) {
    		arr[i] = sc.nextInt();
    	}
    	
    	Arrays.sort(arr);
    	
    	long m = sc.nextLong();
    	long left = 0, right = arr[n - 1];
    	
    	while(left <= right) {
    		long mid = (left + right) / 2;
    		long sum = 0;
    		
    		for(int money : arr) {
    			if(money >= mid)
    				sum += mid;
    			else
    				sum += money;
    		}
    		
    		if(sum > m) {
    			right = mid - 1;
    		} else {
    			left = mid + 1;
    			re = Math.max(re, mid);
    		}
    	}
    	System.out.print(re);
	}
}
