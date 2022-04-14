import java.util.*;

class 팩토리얼0의개수 {
	
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int cnt = 0;
        
        while(n >= 5) {
        	cnt += n / 5;
        	n /= 5;
        }
        
        System.out.println(cnt);
        
    }
}
