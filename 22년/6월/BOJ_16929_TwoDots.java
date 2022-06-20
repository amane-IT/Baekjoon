import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_16929_TwoDots {
    static char[][] map;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int fx, fy;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        map = new char[n][m];

        for(int i = 0; i < n; i++){
            map[i] = br.readLine().toCharArray();
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                fx = i;
                fy = j;
                visited = new boolean[n][m];

                if (dfs(i, j, 1)) {
                    System.out.println("Yes");
                    return;
                }
            }
        }

        System.out.println("No");
    }

    static boolean dfs(int x, int y, int cnt){
        visited[x][y] = true;
        for(int i = 0; i < 4; i++){
            int xx = x + dx[i];
            int yy = y + dy[i];

            if(xx < 0 || xx >= map.length || yy < 0 || yy >= map[0].length)
                continue;

            if(map[x][y] != map[xx][yy])
                continue;

            if(!visited[xx][yy]){
                visited[xx][yy] = true;
                if(dfs(xx, yy, cnt + 1))
                    return true;
            } else{
                if(cnt >= 4 && fx == xx && fy == y)
                    return true;
            }
        }
        return false;
    }
}
