import java.util.*;

class 문자열폭발 {
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String s = sc.next();
    	String bomb = sc.next();
    	Stack<Character> stack = new Stack<>();
    	
    	for(int i = 0; i < s.length(); i++) {
    		stack.push(s.charAt(i));
    		
    		if(stack.size() >= bomb.length()) {
    			boolean flag = true;
    			for(int j = 0; j < bomb.length(); j++) {
    				if(stack.get(stack.size() - bomb.length() + j) != bomb.charAt(j)) {
    					flag = false;
    					break;
    				}
    			}
    			
    			if(flag)
    				for(int j = 0; j < bomb.length(); j++) {
    					stack.pop();
    				}
    		}
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	for(char c : stack) {
    		sb.append(c);
    	}
    	
    	System.out.println(sb.length() > 0 ? sb.toString() : "FRULA");
	}
}
