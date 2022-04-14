import java.util.*;

class 캡틴이다솜 {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int num = 2;
    	List<Integer> list = new ArrayList<>();
    	List<Integer> dp = new ArrayList<>();
    	list.add(1);
    	dp.add(1);
    	
    	while(true) {
    		int tmp = list.get(list.size() - 1) + num;
    		num++;
    		list.add(tmp);
    		tmp += dp.get(dp.size() - 1);
    		dp.add(tmp);
    		
    		if(tmp >= 300_000)
    			break;
    	}
    	
    	int[] res = new int[n + 1];
    	Arrays.fill(res, Integer.MAX_VALUE);
    	
    	res[0] = 0;
    	res[1] = 1;
    	
    	for(int i = 2; i <= n; i++) {
    		for(int j = 0; j < num; j++) {
    			if(dp.get(j) > i) break;
    			res[i] = Math.min(res[i], res[i - dp.get(j)] + 1);
    		}
    	}
    	
    	System.out.print(res[n]);
    	
    	
	}
}
