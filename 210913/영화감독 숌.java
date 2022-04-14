import java.util.*;

class 영화감독_숌 {
	
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int count = 1;
        int num = 666;
        
        while(count != n) {
        	num++;
        	if(Integer.toString(num).contains("666"))
        		count++;
        }
        
        System.out.println(num);
	}
}
