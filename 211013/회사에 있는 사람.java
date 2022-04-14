import java.util.*;

class 회사에있는사람 {
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	Map<String, Integer> map = new HashMap<>();
    	
    	for(int i = 0; i < n; i++) {
    		String name = sc.next();
    		String inout = sc.next();
    		
    		if(map.containsKey(name))
    			map.remove(name);
    		else
    			map.put(name, 1);
    	}
    	
    	List<String> list = new ArrayList<>();

    	for(String s : map.keySet()) {
    		list.add(s);
    	}
    	
    	Collections.sort(list, Collections.reverseOrder());
    	
    	for(String s : list) {
    		System.out.print(s + "\n");
    	}
	}
}
