import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        long[] arr = new long[n];
        long num = Long.MAX_VALUE;
        
        StringTokenizer st = new StringTokenizer(sc.readLine());
        for(int i = 0; i < n; i++) {
        	arr[i] = Long.parseLong(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        int start = 0;
        int end = n - 1;
    	  long tmp1 = arr[start];
    	  long tmp2 = arr[end];

        while(start < end) {
        	long sum = arr[start] + arr[end];
        	
        	if(Math.abs(sum) < num) {
        		num = Math.abs(sum);
        		tmp1 = arr[start];
        		tmp2 = arr[end];
        	}
        	
        	if(sum <= 0)
        		start++;
        	else
        		end--;
        	
        	
        }
        
		System.out.println(tmp1 + " " + tmp2);

    }
}
