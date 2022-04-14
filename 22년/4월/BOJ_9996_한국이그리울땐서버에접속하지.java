import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class BOJ_9996_한국이그리울땐서버에접속하지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] regex = br.readLine().split("\\*");

        for(int i = 0; i < n; i++){
            String tmp = br.readLine();
            if(tmp.length() < regex[0].length() + regex[1].length()){
                System.out.println("NE");
                break;
            }
            String front = tmp.substring(0, regex[0].length());
            String end = tmp.substring(tmp.length() - regex[1].length());

            if(front.equals(regex[0]) && end.equals(regex[1]))
                System.out.println("DA");
            else
                System.out.println("NE");
        }
    }
}
