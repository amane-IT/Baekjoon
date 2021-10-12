import java.util.*;

class Main {
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	Map<String, Integer> dontListen = new HashMap<>();
    	
    	for(int i = 0; i < n; i++) {
    		String tmp = sc.next();
    		dontListen.put(tmp, 0);
    	}
    	
    	List<String> list = new ArrayList<>();

    	for(int i = 0; i < m; i++) {
    		String tmp = sc.next();
    		if(dontListen.containsKey(tmp))
    			list.add(tmp);
    	}
    	
    	Collections.sort(list);
    	
    	System.out.print(list.size() + "\n");
    	for(String s : list) {
    		System.out.print(s + "\n");
    	}
	}
}
