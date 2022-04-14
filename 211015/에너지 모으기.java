import java.util.*;

class 에너지모으기 {
	static int max = 0;
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	List<Integer> list = new ArrayList<>();
    	
    	for(int i = 0; i < n; i++) {
    		list.add(sc.nextInt());
    	}
    	
    	dfs(list, 0);
    	
    	System.out.print(max);
    	
	}
	
	static void dfs(List<Integer> list, int sum) {
		if(list.size() == 2) {
			if(max < sum)
				max = sum;
			return;
		}
		
		for(int i = 1; i < list.size() - 1; i++) {
			int tmp = list.get(i);
			int num = list.get(i - 1) * list.get(i + 1);
			list.remove(i);
			dfs(list, sum + num);
			list.add(i, tmp);
		}
	}
}
