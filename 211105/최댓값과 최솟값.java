import java.util.Arrays;

class PG_최댓값과최솟값 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int[] list = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            list[i] = Integer.parseInt(arr[i]);
        }
        
        Arrays.sort(arr);
        
        answer = arr[0] + " " + arr[arr.length - 1];
        
        return answer;
    }
}
