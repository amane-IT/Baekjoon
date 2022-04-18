import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5671_호텔방번호 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = null;
        while((st = br.readLine()) != null){
            String[] str = st.split(" ");
            int n = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);

            int cnt = 0;

            loop:for(int i = n; i <= m; i++){
                boolean[] arr = new boolean[10];
                String num = String.valueOf(i);

                for(int j = 0; j < num.length(); j++){

                    if(!arr[num.charAt(j) - '0'])
                        arr[num.charAt(j) - '0'] = true;
                    else
                        continue loop;
                }
                cnt++;
            }

            System.out.println(cnt);

        }


    }

}
