import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_14425_문자열집합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<String> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(br.readLine());
        }

        int ans = 0;

        for(int i = 0; i < m; i++){
            if(list.contains(br.readLine()))
                ans++;
        }

        System.out.println(ans);
    }
}
