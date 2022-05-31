import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A2 {
    static class Member implements Comparable<Member>{
        String name;
        int roomCnt;
        int dist;

        Member(String name, int roomCnt, int dist){
            this.name = name;
            this.roomCnt = roomCnt;
            this.dist = dist;
        }

        @Override
        public int compareTo(Member o) {
            if(this.roomCnt == o.roomCnt){
                if(this.dist == o.dist){
                    return this.name.compareTo(o.name);
                }
                return this.dist - o.dist;
            }
            return this.roomCnt - o.roomCnt;
        }
    }

    public static String[] solution(String[] rooms, int target) {
        String[] answer = {};
        List<String> except = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> dis = new HashMap<>();

        List<String> list = new ArrayList<>();

        for(String room : rooms){
            int idx = room.indexOf("]");
            int num = Integer.parseInt(room.substring(1, idx));
            String[] member = room.substring(idx + 1).split(",");

            // 해당 층에 자리가 있는 경우
            if(num == target) {
                except = Arrays.asList(member);
                continue;
            }

            // 자리 세기
            for(String m : member){
                map.put(m, map.getOrDefault(m, 0) + 1);

                // 거리 최소값 구하기기
               if(dis.containsKey(m)){
                    if(dis.get(m) > Math.abs(target - num)){
                        dis.put(m, Math.abs(target - num));
                    }
                } else{
                    dis.put(m, Math.abs(target - num));
                }
            }
        }

        List<Member> members = new ArrayList<>();

        for(String key : map.keySet()){
            members.add(new Member(key, map.get(key), dis.get(key)));
        }

        Collections.sort(members);
        for(Member m : members){
            if(except.contains(m.name))
                continue;
            list.add(m.name);
        }

        answer = list.toArray(new String[list.size()]);

        return answer;
    }

    public static void main(String[] args) {
        String[] rooms = {"[101]Azad,Guard", "[202]Guard", "[303]Guard,Dzaz"};
            //{"[403]James", "[404]Azad,Louis,Andy", "[101]Azad,Guard"};
        int target = 202;

        String[] res = solution(rooms, target);
        for(String s : res){
            System.out.println(s);
        }
    }
}
