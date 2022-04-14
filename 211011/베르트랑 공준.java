import java.util.*;

class 베르트랑공준 {
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		int num = sc.nextInt();
    		if(num == 0)
    			break;
    		
    		int cnt = 0;
    		
    		for(int i = num + 1; i <= num * 2; i++) {
    			if(find(i))
    				cnt++;
    		}
    		
    		System.out.print(cnt + "\n");
    	}
    	
	}
	
	static boolean find(int num) {
		if(num == 1)
			return false;
		
		for(int i = 2; i <= Math.sqrt((double) num); i++) {
			if(num % i == 0)
				return false;
		}
		
		return true;
	}
}
