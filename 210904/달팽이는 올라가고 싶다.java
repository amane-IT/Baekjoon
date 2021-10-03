import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int day = Integer.parseInt(st.nextToken());
        int night = Integer.parseInt(st.nextToken());
        int meter = Integer.parseInt(st.nextToken());
        
        int cnt = (meter - night) / (day - night);
        
        if((meter - night) % (day - night) != 0)
        	cnt++;
        
        System.out.println(cnt);

    }
}
