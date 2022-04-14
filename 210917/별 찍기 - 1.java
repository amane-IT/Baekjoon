import java.util.*;

class 별찍기1 {
	
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++) {
        	for(int j = 0; j < i; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
    }
}
