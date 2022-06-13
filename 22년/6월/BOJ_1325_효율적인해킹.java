import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_1325_효율적인해킹 {

    static boolean[] visited;
    static int[] answer;

    static List<Integer>[] list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        answer = new int[n + 1];
        list = new ArrayList[n + 1];

        for(int i = 1; i <= n; i++){
            list[i] = new ArrayList<>();
        }

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            list[Integer.parseInt(st.nextToken())].add(Integer.parseInt(st.nextToken()));
        }

        for(int i = 1; i <= n; i++){
            visited = new boolean[n + 1];
            visited[i] = true;
            dfs(i);
        }

        int max = 0;
        for(int i = 1; i <= n; i++){
            max = Math.max(max, answer[i]);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            if(answer[i] == max)
                sb.append(i + " ");
        }

        System.out.println(sb);
    }

    static void dfs(int i) {
        for(int next : list[i]){
            if(!visited[next]){
                visited[next] = true;
                answer[next]++;
                dfs(next);
            }
        }
    }

}
