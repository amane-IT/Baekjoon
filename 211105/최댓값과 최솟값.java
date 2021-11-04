import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int[] list = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            list[i] = Integer.parseInt(arr[i]);
        }
        
        Arrays.sort(arr);
        
        answer = Integer.toString(arr[0]) + " " + Integer.toString(arr[arr.length - 1]);
        
        return answer;
    }
}
