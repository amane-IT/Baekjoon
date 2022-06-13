import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_14940_쉬운최단거리 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];
        int x = -1, y = -1;

        for(int i = 0; i < n; i++){
            map[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            if(x == -1){
                for(int j = 0; j < m; j++){
                    if(map[i][j] == 2){
                        x = i;
                        y = j;
                    }
                }
            }
        }

        int[][] route = new int[n][m];
        for(int i = 0; i < n; i++){
            Arrays.fill(route[i], -1);
        }

        route[x][y] = 0;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x, y});
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        while(!q.isEmpty()){
            int[] now = q.poll();

            x = now[0];
            y = now[1];

            for(int i = 0; i < 4; i++){
                int xx = x + dx[i];
                int yy = y + dy[i];

                if(xx < 0 || xx >= n || yy < 0 || yy >= m)
                    continue;

                if(route[xx][yy] != -1)
                    continue;

                if(map[xx][yy] == 0){
                    route[xx][yy] = 0;
                    continue;
                }

                route[xx][yy] = route[x][y] + 1;
                q.add(new int[] {xx, yy});
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if (map[i][j] == 0) {
                    sb.append("0 ");
                }
                else
                    sb.append(route[i][j] + " ");
            }
            sb.append("\n");
        }

        System.out.print(sb);


    }
}
