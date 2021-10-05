import java.util.*;

class Main{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        long n = sc.nextInt();
        
        long[] arr = new long[k];
        long max = 0;
        
        for(int i = 0; i < k; i++) {
        	arr[i] = sc.nextLong();
        	max = Math.max(max, arr[i]);
        }
        
        long left = 1;
        long right = max;
        
        while(left <= right) {
        	long mid = (left + right) / 2;
        	long sum = 0;
        	for(int i = 0; i < k; i++) {
        		sum += (arr[i] / mid);
        	}
        	
        	if(sum >= n)
        		left = mid + 1;
        	else
        		right = mid - 1;	
        }
        System.out.println(right);
        
    }
}
