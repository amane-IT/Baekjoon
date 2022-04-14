import java.util.*;

class 설탕배달 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int kg = sc.nextInt();
        
        if(kg % 5 == 0) {
        	System.out.println(kg / 5);
        	return;
        	
        } else {
        	int quotient = kg / 5;
        	for(int i = quotient; i > 0; i--) {
        		int tmp = kg - (i * 5);
        		if(tmp % 3 == 0) {
        			System.out.println(i + (tmp / 3));
        			return;
        		}
        	}
        }
        
        if(kg % 3 == 0) {
        	System.out.println(kg / 3);
        }
        else
        	System.out.println(-1);
        
    }
}
