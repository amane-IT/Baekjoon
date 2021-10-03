import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int max = 1;
        
        while(n != 0) {
        	int top = 0;
        	int bottom = max + 1;
        	
        	for(int i = 1; i <= max; i++) {
        		n--;
        		top++;
        		bottom--;
        		
        		if(n == 0) {
        			if(max % 2 == 0) {
        				System.out.println(top + "/" + bottom);
        			} else
        				System.out.println(bottom + "/" + top);
        			
        			break;
        		}
        	}
        	max++;
        }

    }
}
