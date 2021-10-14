import java.util.*;

class Main {
	static int max = 0;
	static char[] arr;
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int k = sc.nextInt();
    	arr = sc.next().toCharArray();
    	
    	Stack<Character> s = new Stack<>();
    	
    	s.push(arr[0]);
    	int cnt = 0;
    	boolean flag = true;
    	
    	for(int i = 1; i < n; i++) {
    		char c = arr[i];
    		
    		while(!s.isEmpty() && flag) {
    			if(cnt == k) {
        			flag = false;
        			break;
        		}
        		
        		if(s.peek() < c) {
        			s.pop();
        			cnt++;
        		}
        		else
        			break;
    		}
    		s.push(c);
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	
    	int num = k - cnt;
    	for(int i = 0; i < s.size() - num; i++) {
   			sb.append(s.get(i));
   		}
    	
    	System.out.print(sb);
    	
	}
}
