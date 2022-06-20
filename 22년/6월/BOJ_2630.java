import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2630 {

    static int b = 0, w = 0, n = 0;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        map = new int[n][n];
        for(int i = 0; i < n; i++){
            map[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        count(0, 0, n);

        System.out.println(w + "\n" + b);
    }

    static void count(int r, int c, int size){
        if(isColor(r, c, size)){
            if(map[r][c] == 0)
                w++;
            else
                b++;

            return;
        }

        int n_size = size / 2;

        count(r, c, n_size);
        count(r, c + n_size, n_size);
        count(r + n_size, c, n_size);
        count(r + n_size, c + n_size, n_size);

    }

    static boolean isColor(int r, int c, int size){
        int color = map[r][c];

        for(int i = r; i < r + size; i++){
            for(int j = c; j < c + size; j++){
                if(map[i][j] != color){
                    return false;
                }
            }
        }
        return true;
    }
}
