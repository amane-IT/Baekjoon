import java.util.List;
import java.util.ArrayList;

class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        for(int i = 0; i < progresses.length; i++){
            int tmp = 0;
            if((100 - progresses[i]) % speeds[i] != 0)
                tmp = (100 - progresses[i]) / speeds[i] + 1;
            
            else
                tmp = (100 - progresses[i]) / speeds[i];
            
            progresses[i] = tmp;
        }
        
        for(int i = 1; i < progresses.length; i++){
            if(progresses[i - 1] >= progresses[i]){
                progresses[i] = progresses[i - 1];
            }
        }
        
        List<Integer> list = new ArrayList<>();
        int cnt = 1;
        int day = progresses[0];
        
        for(int i = 1; i < progresses.length; i++){
            if(progresses[i] == day)
                cnt++;
            else{
                list.add(cnt);
                day = progresses[i];
                cnt = 1;
            }
        }
        list.add(cnt);
        
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
