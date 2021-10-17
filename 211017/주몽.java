import java.util.*;

class Main {
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int target = sc.nextInt();
    	
    	int[] arr = new int[n];
    	
    	for(int i = 0; i < n; i++) {
    		arr[i] = sc.nextInt();
    	}
    	
    	int cnt = 0;
    	
    	for(int i = 0; i < n; i++) {
    		int sum = 0;
    		int end = i + 1;
    		
    		while(end < n) {
    			sum = arr[i];
    			sum += arr[end++];
    			
    			if(sum == target) {
    				cnt++;
    				break;
    			}
    		}
    	}
    	
    	System.out.println(cnt);
	}
}
