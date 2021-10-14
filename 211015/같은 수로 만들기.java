import java.util.*;

class Main {
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	long max = 0;
    	long cnt = 0;
    	Stack<Long> stack = new Stack<>();
    	
    	for(int i = 0; i < n; i++) {
    		long num = sc.nextLong();
    		max = Math.max(max, num);
    		
    		if(stack.isEmpty()) {
    			stack.push(num);
    		} else {
    			if(stack.peek() < num) {
    				cnt += num - stack.pop();
    				stack.push(num);
    			} else if(stack.peek() > num) {
    				stack.pop();
    				stack.push(num);
    			}
    		}
    	}
    	
    	while(!stack.isEmpty()) {
    		long num = stack.pop();
    		cnt += max - num;
    	}
    	
    	System.out.print(cnt);
    	
	}
}
