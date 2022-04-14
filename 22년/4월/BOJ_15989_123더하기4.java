import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_15989_123더하기4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] dp = new int[10001][4];
        int n = Integer.parseInt(br.readLine());
        dp[1][1] = 1;
        dp[2][1] = dp[2][2] = 1;
        dp[3][1] = dp[3][2] = dp[3][3] = 1;

        for(int i = 4; i <= 10_000; i++){
            dp[i][1] = dp[i - 1][1];
            dp[i][2] = dp[i - 2][1] + dp[i - 2][2];
            dp[i][3] = dp[i - 3][1] + dp[i - 3][2] + dp[i - 3][3];
        }

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine());
            System.out.println((dp[num][1] + dp[num][2] + dp[num][3]));
        }
    }
}
