import java.util.*;

class 큐 {
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int num = 0;
    	
    	Queue<Integer> q = new LinkedList<>();
    	StringBuilder sb = new StringBuilder();
    	
    	while(n --> 0) {
    		String tmp = sc.next();
    		
    		if(tmp.equals("push")) {
    			num = sc.nextInt();
    			q.add(num);
    			
    		} else if (tmp.equals("pop")) {
    			sb.append(q.size() == 0 ? "-1\n" : q.poll() + "\n");
    			
    		} else if (tmp.equals("size")) {
    			sb.append(q.size() + "\n");
    			
    		} else if (tmp.equals("empty")) {
    			sb.append(q.isEmpty() ? "1 \n" : "0 \n");
    			
    		} else if (tmp.equals("front")) {
    			sb.append(q.isEmpty() ? "-1 \n" : q.peek() + "\n");
    			
    		} else {
    			sb.append(q.isEmpty() ? "-1 \n" : num + "\n");
    		}
    	}
    	
    	System.out.print(sb);
	}
}
