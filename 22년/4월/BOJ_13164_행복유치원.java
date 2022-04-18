import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_13164_행복유치원 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] diff = new int[arr.length - 1];

        for(int i = 0; i < diff.length; i++){
            diff[i] = arr[i + 1] - arr[i];
        }


        Arrays.sort(diff);
        int sum = 0;
        for(int i = 0; i < n - k; i++){
            sum += diff[i];
        }

        System.out.println(sum);
    }
}
