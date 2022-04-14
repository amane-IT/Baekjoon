import java.util.List;
import java.util.ArrayList;

class 제일작은수제거하기 {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        List<Integer> list = new ArrayList<>();
        
        if(arr.length == 1)
            list.add(-1);
        
        else{
            int idx = 0;
            
            for(int i = 1; i < arr.length; i++){
                if(arr[idx] > arr[i]){
                    idx = i;
                }
            }
            
            for(int i = 0; i < arr.length; i++){
                if(i == idx)
                    continue;
                list.add(arr[i]);
            }
        }
        answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
