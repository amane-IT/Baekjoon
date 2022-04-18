import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_16139_인간_컴퓨터상호작용 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] str = br.readLine().toCharArray();
        int[][] map = new int[200_001][26];

        for(int i = 0; i < str.length; i++){

            if(i != 0){
                for (int j = 0; j < 26; ++j){
                    map[i][j] = map[i - 1][j];
                }
            }

            map[i][str[i] - 'a']++;
        }

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; ++i){
            String[] st = br.readLine().split(" ");

            int ch = st[0].charAt(0) - 'a';

            int a = Integer.parseInt(st[1]);
            int b = Integer.parseInt(st[2]);

            int left, right;

            if( a > 0 )
                left = map[a - 1][ch];
            else
                left = 0;

            right = map[b][ch];

           sb.append((right - left) + "\n");
        }

        System.out.println(sb);
    }

}
