import java.util.*;

class 신입사원 {
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int t = sc.nextInt();
    	
    	while(t --> 0) {
    		int n = sc.nextInt();
    		int[] arr = new int[n + 1];
    		int cnt = 1;
    		
    		for(int i = 0; i < n; i++) {
    			arr[sc.nextInt()] = sc.nextInt();
    		}
    		
    		int num = arr[1];
    		
    		for(int i = 2; i <= n; i++) {
    			if(num > arr[i]) {
    				cnt++;
    				num = arr[i];
    			}
    		}
    		
    		System.out.println(cnt);
    	}
	}
}
