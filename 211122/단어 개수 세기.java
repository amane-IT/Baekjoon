import java.util.*;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String s = sc.nextLine();
    	String[] arr = s.split(" |-");
    	List<Character> aeiou = new ArrayList<>(
    			Arrays.asList('a', 'e', 'h', 'i', 'o', 'u'));
    	List<String> frontWord = new ArrayList<>(
    			Arrays.asList("c", "j", "n", "m", "t", "s", "l", "d", "qu"));
    	
    	List<String> list = new ArrayList<>();
    	
    	for(String st : arr) {
    		int idx = st.indexOf("'");
    		if(idx != -1) {
    			String[] tmp = st.split("'");
    			boolean front = frontWord.contains(tmp[0]);
    			boolean end = aeiou.contains(tmp[1].charAt(0));
    			
    			if(front && end) {
    				list.add(tmp[0]);
    				list.add(tmp[1]);
    				
    			} else
    				list.add(st);

    		} else {
    			list.add(st);
    		}
    	}
    	
    	System.out.print(list.size());
	}
}
