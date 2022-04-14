import java.util.*;

class 티켓 {
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int t = sc.nextInt();
    	
    	while(t --> 0) {
    		int x1 = sc.nextInt();
    		int y1 = sc.nextInt();
    		int r1 = sc.nextInt();
    		
    		int x2 = sc.nextInt();
    		int y2 = sc.nextInt();
    		int r2 = sc.nextInt();
    		
    		int d = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    		
    		if(x1 == x2 && y1 == y2 && r1 == r2)
    			System.out.println(-1);
    		
    		else if(d > Math.pow(r1 + r2, 2))
    			System.out.println(0);
    		else if(d < Math.pow(r2 - r1, 2))
    			System.out.println(0);
    		
    		else if (d == Math.pow(r2 - r1, 2))
    			System.out.println(1);
    		else if(d == Math.pow(r1 + r2, 2))
    			System.out.println(1);
    		
    		else
    			System.out.println(2);
    	}
    	
	}
}
