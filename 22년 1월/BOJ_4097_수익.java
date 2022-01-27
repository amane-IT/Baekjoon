package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4097_수익 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			int n = Integer.parseInt(br.readLine());
			if(n == 0)
				break;

			int max = Integer.MIN_VALUE;
			int sum = 0;

			for(int i = 0; i < n; i++){
				int num = Integer.parseInt(br.readLine());
				sum += num;
				max = Math.max(max, sum);

				if(sum < 0)	sum = 0;
			}
			System.out.println(max);
		}
	}
}
