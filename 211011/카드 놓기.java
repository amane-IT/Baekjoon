import java.util.*;

class 카드놓기 {
	static int n, k;
	static int[] arr;
	static boolean[] check;
	static List<String> list = new ArrayList<>();
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	n = sc.nextInt();
    	k = sc.nextInt();

    	arr = new int[n];
    	check = new boolean[n];
    	
    	for(int i = 0; i < n; i++) {
    		arr[i] = sc.nextInt();
    	}
    	
    	perm(0, "");
    	
    	System.out.println(list.size());
    	
	}
	
	static void perm(int depth, String s) {
		if(depth == k) {
			if(!list.contains(s))
				list.add(s);
			return;
		}
		
		for(int i = 0; i < n; i++) {
			if(!check[i]) {
				check[i] = true;
				perm(depth + 1, s + arr[i]);
				check[i] = false;
			}
		}
	}
}
