import java.util.*;

class 연속부분최대곱 {
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	double[] arr = new double[n];
    	double ans = 0, tmp =  1;
    	
    	for(int i = 0; i < n; i++) {
    		arr[i] = sc.nextDouble();
    	}
    	
    	for(int i = 0; i < n; i++) {
    		tmp = 1;
    		for(int j = i; j < n; j++) {
    			tmp *= arr[j];
    			ans = Math.max(ans, tmp);
    		}
    	}
    	System.out.printf("%.3f", ans);   	
	}
}
