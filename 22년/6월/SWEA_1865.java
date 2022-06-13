import java.util.Scanner;

public class SWEA_1865 {

    static int N;
    static double[][] progress;
    static int[] job;
    static double max;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int t = 1; t <= T; t++){
            N = sc.nextInt();
            progress = new double[N][N];
            job = new int[N];
            visited = new boolean[N];
            max = 0.0;

            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    progress[i][j] = sc.nextInt() / 100.0;
                }
            }

            dfs(0, 1.0);
            System.out.printf("#%d %.6f\n", t, max);
        }
    }

    static void dfs(int depth, double sum){
        if(sum * 100 <= max)
            return;
        if(depth == N){
            if(sum * 100 > max){
                max = sum * 100;
                return;
            }
        }

        for(int i = 0; i < N; i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(depth + 1, sum * progress[depth][i]);
                visited[i] = false;
            }
        }
    }
}
