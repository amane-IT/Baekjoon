import java.util.*;

class 코스튬파티 {
	public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int s = sc.nextInt();
    	int[] arr = new int[n];
    	
    	for(int i = 0; i < n; i++) {
    		arr[i] = sc.nextInt();
    	}
    	
    	Arrays.sort(arr);
    	int cnt = 0;
    	
    	for(int i = 0; i < n - 1; i++) {
    		for(int j = i + 1; j < n; j++) {
    			if(arr[i] + arr[j] > s || i == j)
    				continue;
    			cnt++;
    			
    		}
    	}
    	
    	System.out.println(cnt);
    }
}
