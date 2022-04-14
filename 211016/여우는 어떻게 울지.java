import java.util.*;

class 여우는어떻게울지 {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	sc.nextLine();
    	
    	for(int i = 0; i < n; i++){
    		String[] sound = sc.nextLine().split(" ");
    		List<String> list = new ArrayList<>();
    		
    		for(int j = 0; j < sound.length; j++)
    			list.add(sound[j]);
    		
    		while(true) {
    			String ani = sc.nextLine();
    			
    			if(ani.equals("what does the fox say?"))
    				break;
    			
    			String[] animal = ani.split(" ");
    			
    			for(int j = 0; j < list.size(); j++) {
    				if(list.get(j).equals(animal[2])) {
    					list.set(j, "-");
    				}
    			}
    		}
    		
    		String result = "";
    		for(int j = 0; j < list.size(); j++) {
    			if(list.get(j).equals("-"))
    				continue;
    			result += list.get(j) + " ";
    		}
    		System.out.println(result);
    	}
	}
}
