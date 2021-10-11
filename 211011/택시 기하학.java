import java.util.*;

class Main {
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	double n = sc.nextDouble();
    	
    	double circle = n * n * Math.PI;
    	double taxi = n * n * 2;
    	
    	System.out.print(circle + "\n" + taxi);    	
    	
	}
}
