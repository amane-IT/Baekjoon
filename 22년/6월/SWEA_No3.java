import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class SWEA_No3 {

    static int max = 0;
    static List<Integer> idx;
    static boolean[] flag;
    static int[] cnt;
    static List<Integer> tmp;

    public static class Index{
        int num;
        int cnt;
        int idx;

        Index(int num, int cnt, int idx){
            this.num = num;
            this.cnt = cnt;
            this.idx = idx;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int t = 1; t <= T; t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int f = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            tmp = new ArrayList<>();

            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                tmp.add(Integer.parseInt(st.nextToken()));
            }

            cnt = new int[n];
            List<Index> list = new ArrayList<>();

            for(int i = 0; i < tmp.size(); i++){
                list.add(new Index(tmp.get(i), cnt[tmp.get(i) - 1], i));
            }

            findMax();

            flag = new boolean[idx.size()];
            for(int i = 0; i < f - 1; i++){
                Index re = list.remove(0);

                if(!idx.contains(re.num)){
                    list.add(re);
                }
                else{
                    if(flag[idx.indexOf(re.num)]){
                        list.add(re);
                    } else {
                        flag[idx.indexOf(re.num)] = true;
                    }
                }

                if(re.idx == tmp.size() - 1){
                    Arrays.fill(flag, false);
                    cnt = new int[n];
                    findMax();
                }
            }
            System.out.println("#" + t + " " + list.get(0).num);
        }
    }

    static void findMax(){
        for(int i = 0; i < tmp.size(); i++){
            cnt[tmp.get(i) - 1]++;
        }

        max = 0;
        idx = new ArrayList<>();
        for(int i = 0; i < cnt.length; i++){
            max = Math.max(max, cnt[i]);
        }

        for(int i = 0; i < cnt.length; i++){
            if(max == cnt[i])
                idx.add(i + 1);
        }
    }

}
