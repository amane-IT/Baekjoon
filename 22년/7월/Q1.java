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

        long[][] array = new long[n][n];
        array[0][0] = 1;
        array[n - 1][n - 1] = n * n;

        long count = 2;
        int currentX = 0;
        int currentY = 0;

        while(count <= n * n){
            if(currentY + 1 < n)
                currentY++;
            else
                currentX++;

            array[currentX][currentY] = count++;

            while(currentX + 1 < n && currentY - 1 > -1){
                array[++currentX][--currentY] = count++;
            }

            if(currentX + 1 < n)
                currentX++;
            else
                currentY++;

            array[currentX][currentY] = count++;

            while(currentX - 1 > -1 && currentY + 1 < n){
                array[--currentX][++currentY] = count++;
            }

            if(array[r - 1][c - 1] != 0){
                break;
            }

        }


        return array[r - 1][c - 1];
    }
}
