import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class BOJ_10546_배부른마라토너 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < n * 2 - 1; i++){
            String p = br.readLine();
            if(map.containsKey(p))
                map.remove(p);
            else
                map.put(p, 1);
        }

        for(String s : map.keySet()){
            System.out.println(s);
        }
    }
}
