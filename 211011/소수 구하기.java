import java.util.*;

class 소수구하기 {
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	
    	List<Integer> list = new ArrayList<>();
    	
    	for(int i = n; i <= m; i++) {
    		if(find(i))
    			System.out.print(i + "\n");
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
