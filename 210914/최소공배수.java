import java.util.*;

class Main {
	
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        while(n --> 0){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
        
            int factor = gcd(num1, num2);        
            num1 /= factor;
            num2 /= factor;
        
            System.out.println(factor * num1 * num2);
        }
        
        
        
	}
    
    static int gcd(int n1, int n2) {
    	if(n2 == 0)
    		return n1;
    	
    	return gcd(n2, n1 % n2);
    }
}
