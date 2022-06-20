import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BOJ_19583 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] times = br.readLine().split(" ");
        int[] start = Arrays.stream(times[0].split(":")).mapToInt(Integer::parseInt).toArray();
        int[] end = Arrays.stream(times[1].split(":")).mapToInt(Integer::parseInt).toArray();
        int[] s_end = Arrays.stream(times[2].split(":")).mapToInt(Integer::parseInt).toArray();

        int s = start[0] * 60 + start[1];
        int e = end[0] * 60 + end[1];
        int se = s_end[0] * 60 + s_end[1];

        Map<String, Integer> map = new HashMap<>();

        String str = br.readLine();

        while(true){
            String[] tmp = str.split(" ");
            int h = Integer.parseInt(tmp[0].split(":")[0]);
            int m = Integer.parseInt(tmp[0].split(":")[1]);

            int total = h * 60 + m;

            if(total <= s)
                map.put(tmp[1], 1);

            if(total >= e && total <= se){
                if(map.containsKey(tmp[1]))
                    map.put(tmp[1], 2);
            }

            str = br.readLine();
            if(str == null)
                break;
        }

        int ans = 0;

        for(String st : map.keySet()){
            if(map.get(st) == 2)
                ans++;
        }

        System.out.println(ans);
    }
}
