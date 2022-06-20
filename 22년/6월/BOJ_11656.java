import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BOJ_11656 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        PriorityQueue<String> q = new PriorityQueue<>();

        for(int i = 0; i < str.length(); i++){
            String tmp = str.substring(i);
            q.add(tmp);
        }

        StringBuilder sb = new StringBuilder();
        while(!q.isEmpty()){
            sb.append(q.poll() + "\n");
        }
        System.out.println(sb.toString());
    }
}
