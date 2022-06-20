import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BOJ_16198 {

    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i = 0; i < n; i++){
            list.add(arr[i]);
        }

        dfs(list, 0);

        System.out.println(max);
    }

    static void dfs(List<Integer> list, int sum){
        if(list.size() == 2){
            max = Math.max(max, sum);
            return;
        }

        for(int i = 1; i < list.size() - 1; i++){
            int num = list.get(i);
            int mul = list.get(i - 1) * list.get(i + 1);
            list.remove(i);
            dfs(list, sum + mul);
            list.add(i, num);
        }
    }
}
