import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_20440_니가싫어싫어너무싫어 {
    static class Time{
        int start, end;
        public Time(int start, int end){
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Time[] t = new Time[n];

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            t[i] = new Time(start, end);
        }

        Arrays.sort(t, new Comparator<Time>() {
            @Override
            public int compare(Time o1, Time o2) {
                if(o1.start == o2.start)
                    return o1.end - o2.end;
                return o1.start - o2.start;
            }
        });

        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(t[0].end);
        int cnt = 1;
        int s = t[0].start;
        int e = t[0].end;

        for(int i = 1; i < n; i++){
            while(!q.isEmpty() && q.peek() < t[i].start){
                q.poll();
            }
            if(!q.isEmpty() && q.peek() == t[i].start){
                if(q.peek() == e){
                    e = t[i].end;
                }
                q.poll();
            }
            q.add(t[i].end);
            if(q.size() > cnt){
                cnt = q.size();
                s = t[i].start;
                e = q.peek();
            }
        }


//        for(int i = 0; i < n; i++){
//            String[] tmp = br.readLine().split(" ");
//            for(int j = Integer.parseInt(tmp[0]); j < Integer.parseInt(tmp[1]); j++){
//                map.put(j, map.getOrDefault(j, 0) + 1);
//            }
//        }
//
//        List<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
//
//        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>(){
//
//            @Override
//            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
//                if(o2.getValue() == o1.getValue()){
//                    return o1.getKey().compareTo(o2.getKey());
//                }
//                return o2.getValue().compareTo(o1.getValue());
//            }
//        });
//
//        int max = list.get(0).getValue();
//        int start = 0, end = 0;
//        for(Map.Entry<Integer, Integer> entry : list){
//            //System.out.println(entry.getKey() + " " + entry.getValue());
//            if(entry.getValue() == max){
//                if(start == 0)
//                    start = entry.getKey();
//                else{
//                    if(end == 0 || end + 1 == entry.getKey())
//                        end = entry.getKey();
//                    else
//                        break;
//                }
//            } else
//                break;
//        }

        System.out.println(cnt);
        System.out.println(s + " " + (e));

    }
}
