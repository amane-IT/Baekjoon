import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2422_한윤정이이탈리아가서아이스크림 {
    static int n, k, cnt;
    static boolean[] visited;
    static boolean[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        cnt = 0;
        visited = new boolean[n + 1];
        map = new boolean[n + 1][n + 1];

        for(int i = 0; i < k; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map[a][b] = map[b][a] = true;
        }

//        for(int i = 1; i <= n - 2; i++){
//            for(int j = i + 1; j <= n - 1; j++){
//
//                if(map[i][j])
//                    continue;
//
//                for(int k = j + 1; k <= n; k++){
//                    if(map[i][k] || map[j][k])
//                        continue;
//
//                    cnt++;
//                }
//            }
//        }

        dfs(0,new int[3], 1);

        System.out.println(cnt);
    }

    static void dfs(int depth, int[] save, int start){
        if(depth == 3){
            if(map[save[0]][save[1]] || map[save[1]][save[2]] || map[save[0]][save[2]])
                return;

            cnt++;
            return;
        }

        for(int i = start; i <= n; i++){
            save[depth] = i;
            dfs(depth + 1, save, i + 1);
        }
    }
}
