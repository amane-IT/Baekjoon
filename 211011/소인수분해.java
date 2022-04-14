import java.util.*;

class 소인수분해 {
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int num = 2;
    	List<Integer> list = new ArrayList<>();
    	
    	while(n > 1) {
    		if(n % num == 0) {
    			list.add(num);
    			n /= num;
    		}
    		else {
    			num++;
    		}
    	}
    	
    	for(int i = 0; i < list.size(); i++) {
    		System.out.print(list.get(i) + "\n");
    	}
    	
	}
}
