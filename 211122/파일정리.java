import java.util.*;

class 파일정리 {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	Map<String, Integer> map = new HashMap<>();
    	int n = sc.nextInt();
    	
    	while(n --> 0) {
    		String s = sc.next();
    		String[] tmp = s.split("\\.");
    		
    		map.put(tmp[1], map.getOrDefault(tmp[1], 0) + 1);
    	}
    	
    	Object[] mapKey = map.keySet().toArray();
    	Arrays.sort(mapKey);
    	
    	for(Object s : mapKey) {
    		System.out.println(s + " " + map.get(s));
    	}
	}
}
