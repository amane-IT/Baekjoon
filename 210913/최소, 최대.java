import java.util.*;

class 최소_최대 {
	
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < n; i++) {
        	int num = sc.nextInt();
        	max = Math.max(max, num);
        	min = Math.min(min, num);
        }
        
        System.out.println(min + " " + max);
	}
}
