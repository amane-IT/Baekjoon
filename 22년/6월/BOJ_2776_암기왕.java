import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_2776_암기왕 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            Map<Integer, Boolean> list = new HashMap<>();

            for(int j = 0; j < n; j++){
                list.put(Integer.parseInt(st.nextToken()), true);
            }

            int m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < m; j++){
                if(list.containsKey(Integer.parseInt(st.nextToken())))
                    bw.write("1\n");
                else
                    bw.write("0\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
