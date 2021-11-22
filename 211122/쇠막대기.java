import java.util.*;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String s = sc.nextLine();
    	Stack<Character> stack = new Stack<>();
    	int cnt = 0;
    	
    	for(int i = 0; i < s.length(); i++) {
    		char tmp = s.charAt(i);
    		if(tmp == '(')
    			stack.push('(');
    		
    		else {
    			stack.pop();
    			if(s.charAt(i - 1) == '(') {
    				cnt += stack.size();
    			} else
    				cnt++;
    		}
    	}
    	
    	System.out.println(cnt);
	}
}
