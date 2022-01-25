package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11724_연결_요소의_개수 {

	static int[][] graph = new int[1001][1001];
	static int V, E;
	static boolean[] check = new boolean[1001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());

		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			graph[a][b] = graph[b][a] = 1;
		}

		int result = 0;

		for(int i = 1; i <= V; i++){
			if(!check[i]){
				dfs(i);
				result++;
			}
		}

		System.out.println(result);
	}

	public static void dfs(int idx){
		if(check[idx])
			return;

		else{
			check[idx] = true;
			for(int i = 1; i <= V; i++){
				if(graph[idx][i] == 1){
					dfs(i);
				}
			}
		}
	}
}
