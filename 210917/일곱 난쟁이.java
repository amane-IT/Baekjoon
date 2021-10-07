import java.util.*;

class Main {
	
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[9];
        int sum = 0;
        for(int i = 0; i < 9; i++) {
        	arr[i] = sc.nextInt();
        	sum += arr[i];
        }
        
        sum -= 100;
        
        Arrays.sort(arr);
        
        int p = 0;
        int q = 0;
        
        for(int i = 0; i < 9; i++) {
        	for(int j = 0; j < 9; j++) {
        		if(i == j)
        			continue;
        		
        		if(arr[i] + arr[j] == sum) {
        			p = i;
        			q = j;
        			break;
        		}
        	}
        }
        
        for(int i = 0; i < 9; i++) {
        	if(i != p && i != q)
        		System.out.println(arr[i]);
        }       
    }
}
