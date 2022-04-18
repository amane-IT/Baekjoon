import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;


public class BOJ_20159_동작그만밑장뺴기냐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int sum_odd = 0;
        int sum_even = 0;
        int last = 0;

        int[][] sum = new int[2][n / 2 + 1];
        int[] num = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int i = 0; i < n; i++){
            if((i + 1) % 2 == 0)
                sum[0][i / 2 + 1] = sum[0][i / 2] + num[i];
            else{
                sum[1][i / 2 + 1] = sum[1][i / 2] + num[i];
            }
        }

        int[] res = new int[n + 1];
        int max = 0;

        for(int i = 1; i <= n; i++){
            int idx = i / 2 + 1;
            if(i % 2 == 0){
                res[i] = sum[1][idx - 1] + (sum[0][n / 2 - 1] - sum[0][idx - 2]);
            }
            else{
                res[i] = sum[0][idx - 1] + (sum[1][n / 2 - 1] - sum[1][idx - 1]) + num[n - 1];
            }

            max = Math.max(max, res[i]);
        }

        System.out.println(max);

//        List<String> list = new ArrayList<>(Arrays.asList(br.readLine().split(" ")));
//        int cnt = Integer.parseInt(list.remove(0));
//        list.remove(0);
//        boolean flag = false;
//
//        while(!list.isEmpty()){
//            if(!flag){
//                if(Integer.parseInt(list.get(0)) >= Integer.parseInt(list.get(list.size() - 1))) {
//                    cnt += Integer.parseInt(list.remove(0));
//                    list.remove(0);
//                }
//                else{
//                    cnt += Integer.parseInt(list.remove(list.size() - 1));
//                    list.remove(0);
//                    flag = true;
//                }
//            } else {
//                if(Integer.parseInt(list.get(0)) >= Integer.parseInt(list.get(list.size() - 1))) {
//                    cnt += Integer.parseInt(list.remove(0));
//                    list.remove(0);
//                }
//            }
//        }
//        System.out.println(cnt);
    }
}
