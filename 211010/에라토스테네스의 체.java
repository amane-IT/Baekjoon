import java.util.*;

class 에라스토테네스의체 {
	static boolean[] check;
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int k = sc.nextInt();
    	int cnt = 0;
    	int flag = 0;
    	
    	check = new boolean[n + 1];
    	
    	for(int i = 2; i <= n; i++) {
    		for(int j = i; j <= n; j += i) {
    			if(!check[j]) {
    				cnt++;
    				check[j] = true;
    			}
    			
    			if(cnt == k) {
    				System.out.println(j);
    				System.exit(0);
    			}
    		}
    	}
	}
}
