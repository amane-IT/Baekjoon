import java.util.*;

class Main {
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		int[] arr = new int[3];
    		
    		arr[0] = sc.nextInt();
    		arr[1] = sc.nextInt();
    		arr[2] = sc.nextInt();
    		
    		if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0)
    			break;
    		
    		Arrays.sort(arr);
    	
    		if(Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2))
    			System.out.print("right \n");
    		else
    			System.out.print("wrong \n");
    	}
    	
	}
}
