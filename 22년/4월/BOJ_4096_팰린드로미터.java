import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4096_팰린드로미터 {
    static char[] st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        while(!s.equals("0")){
            st = s.toCharArray();
            System.out.println(find(1));
            s = br.readLine();
        }

    }

    static int find(int cur){
        int tmp = 0;
        if(st[cur - 1] >= st[st.length - cur])
            tmp = st[cur - 1] - st[st.length - cur];

        else{
            int cnt = 1;
            while(true){
                if(st[st.length - cur - cnt] == '9'){
                    st[st.length - cur - cnt] = '0';
                    cnt++;

                } else{
                    st[st.length - cur - cnt] += 1;
                    break;
                }
            }
            tmp = st[cur - 1] - st[st.length - cur] + 10;
        }

        st[st.length - cur] = st[cur - 1];
        if(cur == st.length / 2)
            return tmp * (int)Math.pow(10, cur - 1);

        return tmp * (int) Math.pow(10, cur - 1) + find(cur + 1);
    }
}
