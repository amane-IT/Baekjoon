import java.util.*;


/*
세그먼트 트리를 몰라서 아래 주소 참고함
https://coder-in-war.tistory.com/entry/BOJ-JAVA2357-%EC%B5%9C%EC%86%9F%EA%B0%92%EA%B3%BC-%EC%B5%9C%EB%8C%93%EA%B0%92
*/
class 최소값과최대값 {
	static int n, m;
	static int[] arr;
	
	static class SegmentTree{
		long[] minTree, maxTree;
		
		public SegmentTree() {
			minTree = new long[n * 4];
			maxTree = new long[n * 4];
		}
		
		long minInit(long[] tree, int node, int start, int end) {
			if(start == end)	return minTree[node] = arr[start];
			
			int mid = (start + end) / 2;
			
			return minTree[node] = Math.min(minInit(tree, node * 2, start, mid), minInit(tree, node * 2 + 1, mid + 1, end));
			
		}
		
		long maxInit(long[] tree, int node, int start, int end) {
			if(start == end) 	return maxTree[node] = arr[start];
			
			int mid = (start + end) / 2;
			
			return maxTree[node] = Math.max(maxInit(tree, node * 2, start, mid), maxInit(tree, node * 2 + 1, mid + 1, end));
		}
		
		long findMin(long[] tree, int node, int start, int end, int left, int right) {
			if(right < start || left > end)
				return Integer.MAX_VALUE;
			
			if(left <= start && right >= end)
				return minTree[node];
			
			int mid = (start + end) / 2;
			
			return Math.min(findMin(tree, node * 2, start, mid, left, right), findMin(tree, node * 2 + 1, mid + 1, end, left, right));
			
		}
		
		long findMax(long[] tree, int node, int start, int end, int left, int right) {
			if(right < start || left > end)
				return 0;
			
			if(left <= start && right >= end)
				return maxTree[node];
			
			int mid = (start + end) / 2;
			
			return Math.max(findMax(tree, node * 2, start, mid, left, right), findMax(tree, node * 2 + 1, mid + 1, end, left, right));
		}
	}
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();
        
        arr = new int[n + 1];
        for(int i = 1; i <= n; i++) {
        	arr[i] = sc.nextInt();
        }
        
        SegmentTree tree = new SegmentTree();
        tree.minInit(tree.minTree, 1, 1, n);
        tree.maxInit(tree.maxTree, 1, 1, n);
        
        while(m --> 0) {
        	int start = sc.nextInt();
        	int end = sc.nextInt();
        	
        	long max = tree.findMax(tree.maxTree, 1, 1, n, start, end);
        	long min = tree.findMin(tree.minTree, 1, 1, n, start, end);
        	        	
        	System.out.println(min + " " + max);
        }
        
    }
}
