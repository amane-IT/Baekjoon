import java.util.*;

class 네번째점 {
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int[] x = new int[3];
    	int[] y = new int[3];
    	
    	Stack<Integer> sx = new Stack<>();
    	Stack<Integer> sy = new Stack<>();
    	
    	for(int i = 0; i < 3; i++) {
    		x[i] = sc.nextInt();
    		y[i] = sc.nextInt();
    	}
    	
    	Arrays.sort(x);
    	Arrays.sort(y);
    	
    	for(int i = 0; i < 3; i++) {
    		if(sx.isEmpty()) {
    			sx.push(x[i]);
    		} else {
    			if(sx.peek() == x[i])
    				sx.pop();
    			else {
    				sx.push(x[i]);
    			}
    		}
    		
    		if(sy.isEmpty()) {
    			sy.push(y[i]);
    		} else {
    			if(sy.peek() == y[i])
    				sy.pop();
    			else {
    				sy.push(y[i]);
    			}
    		}
    	}
    	
    	System.out.print(sx.pop() + " " + sy.pop());
    	
	}
}
