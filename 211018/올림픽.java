import java.util.*;

class Main {
	static class Medal implements Comparable<Medal>{
		int idx, gold, silver, bronze, rank;
		
		public Medal(int idx, int gold, int silver, int bronze, int rank) {
			this.idx = idx;
			this.gold = gold;
			this.silver = silver;
			this.bronze = bronze;
			this.rank = rank;
		}
		
		public int compareTo(Medal m) {
			if(this.gold == m.gold) {
				if(this.silver == m.silver) {
						return m.bronze - this.bronze;
				}
				return m.silver - this.silver;
			}
			return m.gold - this.gold;
		}
	}
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	List<Medal> list = new ArrayList<>();
    	
    	for(int i = 0; i < n; i++) {
    		int idx = sc.nextInt();
    		int gold = sc.nextInt();
    		int silver = sc.nextInt();
    		int bronze = sc.nextInt();
    		
    		list.add(new Medal(idx, gold, silver, bronze, 0));
    	}
    	
    	Collections.sort(list);
    	list.get(0).rank = 1;
    	int cnt = 0;
    	
    	for(int i = 1; i < n; i++) {
    		int tmp_g = list.get(i - 1).gold;
    		int tmp_s = list.get(i - 1).silver;
    		int tmp_b = list.get(i - 1).bronze;
    		Medal now = list.get(i);
    		
    		if(list.get(i).idx == m) {
    			cnt = i;
    		}
    		
    		if(now.gold == tmp_g && now.silver == tmp_s && now.bronze == tmp_b) {
    			list.get(i).rank = list.get(i - 1).rank;
    		} else {
    			list.get(i).rank = i + 1;
    		}
    	}
    	
    	System.out.println(list.get(cnt).rank);
	}
}
