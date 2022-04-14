import java.util.*;

class 가장긴증가하는부분수열2 {
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	List<Integer> list = new ArrayList<>();
    	list.add(0);
    	
    	for(int i = 0; i < n; i++) {
    		int tmp = sc.nextInt();
    		
    		if(list.get(list.size() - 1) < tmp)
    			list.add(tmp);
    		else {
    			int left = 1;
    			int right = list.size() - 1;
    			
    			while(left < right) {
    				int mid = (left + right) / 2;
    				if(list.get(mid) < tmp)
    					left = mid + 1;
    				else
    					right = mid;
    			}
    			list.set(right, tmp);
    		}
    	}
    	
    	System.out.print(list.size() - 1);
    	
	}
}
