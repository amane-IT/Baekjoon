import java.util.Stack;

class 짝지어제거하기 {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(stack.isEmpty() || stack.peek() != ch)
				stack.push(ch);
			
			else
				stack.pop();
		}
		
		if(stack.size() == 0)
			return 1;
		else
			return 0;
    }
}
