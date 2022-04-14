import java.util.*;

class 등수구하기 {
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	long newP = sc.nextLong();
    	int p = sc.nextInt();
    	List<Integer> list = new ArrayList<>();
    	
    	for(int i = 0; i < n; i++) {
    		list.add(sc.nextInt());
    	}
    	
    	Collections.sort(list, Collections.reverseOrder());
    	int rank = 1;
    	
    	if(n == p && newP <= list.get(list.size() - 1))
    		rank = -1;
    	else {
    		for(int i = 0; i < n; i++) {
        		if(list.get(i) > newP) {
        			rank++;
        		} else {
        			break;
        		}
        	}
    	}
    	
    	System.out.println(rank);
    	
	}
}
