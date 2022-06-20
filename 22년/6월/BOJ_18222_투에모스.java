import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_18222_투에모스 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        long ans = recur(n - 1);

        System.out.println(ans);
    }

    static long recur(long n){
        if(n == 0 || n == 1)
            return n;

        if(n % 2 == 1){
            return 1 - recur(Math.floorDiv(n, 2));
        } else{
            return recur(Math.floorDiv(n, 2));
        }
    }
}
