import java.util.*;

class 로프 {
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int[] arr = new int[n];
    	
    	for(int i = 0; i < n; i++) {
    		arr[i] = sc.nextInt();
    	}
    	
    	Arrays.sort(arr);
    	
    	long max = 0;
    	for(int i = n - 1; i >= 0; i--) {
    		arr[i] = arr[i] * (n - i);
    		max = Math.max(max, arr[i]);
    	}
    	
    	System.out.println(max);
	}
}
