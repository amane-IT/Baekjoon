import java.util.*;

class Main {
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int cnt = 0;
    	
    	for(int i = 0; i < n; i++) {
    		if(find(sc.nextInt()))
    			cnt++;
    	}
    	
    	System.out.println(cnt);
	}
	
	static boolean find(int num) {
		if(num == 1)
			return false;
		
		boolean flag = true;
		for(int i = 2; i <= Math.sqrt((double) num); i++) {
			if(num % i == 0)
				flag = false;
		}
		
		return flag;
	}
}
