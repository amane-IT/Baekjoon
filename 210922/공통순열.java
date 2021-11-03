import java.util.*;

public class Main{
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(sc.hasNextLine()) {
    		char[] s1 = sc.nextLine().toCharArray();
    		char[] s2 = sc.nextLine().toCharArray();
    		
    		Map<Character, Integer> map1 = new HashMap<>();
    		Map<Character, Integer> map2 = new HashMap<>();
    		ArrayList<Character> list = new ArrayList<>();
    		
    		for(char c : s1)
    			map1.put(c, map1.getOrDefault(c, 0) + 1);
    		
    		for(char c : s2)
    			map2.put(c, map2.getOrDefault(c, 0) + 1);
    		
    		for(char c : map1.keySet()) {
    			if(map2.containsKey(c)) {
    				int num = Math.min(map1.get(c), map2.get(c));
    				while(num --> 0)
    					list.add(c);
    			}
    		}
    		
    		Collections.sort(list);
    		String answer = "";
    		
    		for(int i = 0; i < list.size(); i++) {
    			answer += list.get(i);
    		}
    		
    		System.out.println(answer);
    	}
    	
    }
}
