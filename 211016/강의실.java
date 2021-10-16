import java.util.*;

class Main {
	static class Lecture implements Comparable<Lecture>{
		int idx, start, end;
		
		public Lecture(int idx, int start, int end) {
			this.idx = idx;
			this.start = start;
			this.end = end;
		}
		
		@Override
		public int compareTo(Lecture l1) {
			return Integer.compare(this.start, l1.start);
		}
	}

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	PriorityQueue<Integer> q = new PriorityQueue<>();
    	List<Lecture> list = new ArrayList<>();
    	
    	
    	for(int i = 0; i < n; i++) {
    		int idx = sc.nextInt();
    		int start = sc.nextInt();
    		int end = sc.nextInt();
    		
    		list.add(new Lecture(idx, start, end));
    	}
    	
    	Collections.sort(list);
    	
    	int max = 0;
    	
    	for(int i = 0; i < n; i++) {
    		while(!q.isEmpty() && q.peek() <= list.get(i).start) {
    			q.poll();
    		}
    		
    		q.add(list.get(i).end);
    		max = Math.max(max, q.size());
    	}
    	
    	System.out.println(max);
	}
}
