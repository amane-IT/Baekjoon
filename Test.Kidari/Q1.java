public class Q1 {

    public static void main(String[] args) {
        int n = 5;
        int r = 3;
        int c = 2;

        long res = solution(n, r, c);

        System.out.println(res);
    }

    public static long solution(int n, int r, int c) {
        long answer = 0;

        long[][] map = new long[n][n];
        map[0][0] = 1;
        map[n - 1][n - 1] = n * n;

        long count = 2;
        int x = 0;
        int y = 0;

        while(count <= n * n){
            if(x + 1 < n)
                x++;
            else
                y++;

            map[x][y] = count++;

            while(x - 1 > -1 && y - 1 > -1){
                map[--x][--y] = count++;
            }

            if(y + 1 < n)
                y++;
            else
                x++;

            map[x][y] = count++;

            while(x + 1 < n && y + 1 < n){
                map[++x][++y] = count++;
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
