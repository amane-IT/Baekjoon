import java.util.*;

class 골드바흐의추측_2 {
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int t = sc.nextInt();
    	
    	boolean[] check = new boolean[10001];
    	Arrays.fill(check, true);
    	
    	for(int i = 2; i <= 10000; i++) {
    		for(int j = i * 2; j <= 10000; j += i) {
    			if(!check[j])
    				continue;
    			check[j] = false;
    		}
    	}
    	
    	while(t --> 0) {
    		int num = sc.nextInt();
    		boolean flag = false;
    		int n1 = 0;
    		int n2 = 0;
    		
    		for(int i = 2; i <= num/2; i++) {
    			if(check[i] && check[num - i]) {
    				n1 = i;
    				n2 = num - i;
    			}
    		}
    		
    		System.out.println(n1 + " " + n2);
    	}
    	
  }
}
