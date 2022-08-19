package LG;
import java.util.*;

public class Q2 {
    public int solution(String[] ings, String[] menu, String[] sell) {
        int answer = 0;

        int[] ing = new int[26];
        int[] money = new int[26];
        Map<String, Integer> menuFee = new HashMap<>();

        for(String s : ings){
            String[] tmp = s.split(" ");
            ing[tmp[0].charAt(0) - 'a'] = Integer.parseInt(tmp[1]);
        }

        for(String m : menu){
            String[] tmp = m.split(" ");

            for(int i = 0; i < tmp[1].length(); i++){
                char ch = tmp[1].charAt(i);
                money[ch - 'a']++;
            }

            int pay = 0;

            for(int i = 0; i < 26; i++){
                if(ing[i] == 0)
                    continue;

                pay += (ing[i] * money[i]);
            }
            //System.out.println(tmp[0] + " +  " + pay);
            menuFee.put(tmp[0], Integer.parseInt(tmp[2]) - pay);
            money = new int[26];
        }

        for(String s : sell){
            String[] tmp = s.split(" ");
            answer += Integer.parseInt(tmp[1]) * menuFee.get(tmp[0]);
        }

        return answer;
    }
}
