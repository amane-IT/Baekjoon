import java.util.*;

class 소수찾기_2 {
    static char[] arr;
    static boolean[] check;
    static String[] num;
    static ArrayList<Integer> list = new ArrayList<>();
    
    public int solution(String numbers) {
        int answer = 0;
        arr = numbers.toCharArray();
        check = new boolean[arr.length];
        
        for(int i = 1; i <= arr.length; i++){
            num = new String[i];
            dfs(0, i);
        }
        
        answer = list.size();
        
        return answer;
    }
    
    static void dfs(int depth, int target){
        if(depth == target){
            String t = "";
            
            for(int i = 0; i < target; i++){
                t += num[i];
            }
            
            int tmp = Integer.parseInt(t);
            
            if(!list.contains(tmp)){
                if(tmp > 1){
                    boolean flag = true;
                    for(int i = 2; i <= Math.sqrt(tmp); i++){
                        if(tmp % i == 0){
                            flag = false;
                            break;
                        }
                    }
                    
                    if(flag)
                        list.add(tmp);
                }
            }
            return;
        }
        
        for(int i = 0; i < arr.length; i++){
            if(!check[i]){
                check[i] = true;
                num[depth] = arr[i] + "";
                dfs(depth + 1, target);
                //result.substring(0, result.length() - 1);
                check[i] = false;
            }
        }
    }
}
