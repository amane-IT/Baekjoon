
import java.util.*;

public class Emart_Q1 {
    public int solution(int no, int[] works) {
        int result = 0;

        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for(int i : works){
            if(i > 0)
                q.add(i);
        }

        for(int i = 0; i < no; i++){
            int work = q.poll();
            work--;
            if(work > 0)
                q.add(work);
        }

        int size = q.size();

        for(int i = 0; i < size; i++){
            int work = q.poll();
            result += work * work;
        }

        return result;
    }
}