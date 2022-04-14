import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ_99933_민균이의비밀번호 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            list.add(br.readLine());
        }

        for(String st : list){
            StringBuilder sb = new StringBuilder(st).reverse();
            if(list.contains(sb.toString())){
                System.out.println(sb.length() + " " + st.charAt(st.length() / 2));
                return;
            }
        }
    }
}
