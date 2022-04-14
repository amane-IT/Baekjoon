import java.util.*;

class 기타레슨 {
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	int[] arr = new int[n];
    	int left = 0;
    	int right = 0;
    	
    	for(int i = 0; i < n; i++) {
    		arr[i] = sc.nextInt();
    		right += arr[i];
    		left = Math.max(left, arr[i]);
    	}
    	
    	while(left <= right) {
    		int mid = (left + right) / 2;
    		int sum = 0;
    		int cnt = 0;
    		
    		for(int i = 0; i < n; i++) {
    			if(sum + arr[i] > mid) {
    				sum = 0;
    				cnt++;
    			}
    			sum += arr[i];
    		}
    		
    		if(sum != 0)
    			cnt++;
    		if(cnt <= m)
    			right = mid - 1;
    		else
    			left = mid + 1;
    	}
    	
    	System.out.println(left);
	}
}
