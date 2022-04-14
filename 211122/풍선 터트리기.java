import java.util.*;

class 풍선터트리기 {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	Deque<int[]> d = new ArrayDeque<>();
    	StringBuilder sb = new StringBuilder();
    	
    	sb.append("1 ");
    	int jump = sc.nextInt();
    	for(int i = 2; i <= n; i++) {
    		d.add(new int[] {i, sc.nextInt()});
    	}
    	
    	while(d.size() != 0) {
    		if(jump > 0) {
    			for(int i = 1; i < jump; i++) {
        			d.add(d.poll());
        		}
    			int[] tmp = d.poll();
    			jump = tmp[1];
    			sb.append(tmp[0] + " ");
    			
    		} else {
    			jump = Math.abs(jump);
    			for(int i = 1; i < jump; i++) {
    				d.addFirst(d.pollLast());
    			}
    			int[] tmp = d.pollLast();
    			jump = tmp[1];
    			sb.append(tmp[0] + " ");
    		}
    		
    	}
//    	sb.append(d.poll()[0]);
    	System.out.print(sb);
    	
	}
}
