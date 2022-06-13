import java.util.Scanner;

public class SWEA_4311 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int n = sc.nextInt();
            int o = sc.nextInt();
            int m = sc.nextInt();

            int[] possible = new int[1000];
            boolean[] visited = new boolean[1000];
            boolean[] op = new boolean[4];

            for(int i = 0; i < n; i++){
                int num = sc.nextInt();
                possible[num] = 1;
                visited[num] = true;
            }

            for(int i = 0; i < o; i++){
                op[sc.nextInt() - 1] = true;
            }

            int target = sc.nextInt();

            for(int i = 1; i < 10; i++){
                if(possible[i] != 0){
                    for(int j = 0; j < 10; j++){
                        if(possible[j] != 0) {
                            possible[i * 10 + j] = 2;
                            visited[i * 10 + j] = true;
                        }
                    }
                }
            }

            for(int i = 10; i < 100; i++){
                if(possible[i] != 0){
                    for(int j = 0; j < 10; j++){
                        if(possible[j] != 0) {
                            possible[i * 10 + j] = 3;
                            visited[i * 10 + j] = true;
                        }
                    }
                }
            }

            if(possible[target] != 0){
                System.out.println("#" + t + " " + possible[target]);
                continue;
            }

            int r = -1;
            for(int i = 3; i < m; i++){
                for(int j = 999; j > 0; j--){
                    if(possible[j] == 0 || possible[j] + 2 > i)
                        continue;
                    for(int k = 999; k > 0; k--){
                        if(!visited[k] || possible[k] + possible[j] + 1 > i)
                            continue;

                        if(op[0]){
                            if(j + k < 1000){
                                if(possible[j + k] == 0){
                                    possible[j + k] = possible[j] + possible[k] + 1;
                                }
                            }
                        }

                        if(op[1]){
                            if(j - k >= 0){
                                if(possible[j - k] == 0){
                                    possible[j - k] = possible[j] + possible[k] + 1;
                                }
                            }
                        }

                        if(op[2]){
                            if(j * k < 1000){
                                if(possible[j * k] == 0){
                                    possible[j * k] = possible[j] + possible[k] + 1;
                                }
                            }
                        }

                        if(op[3]){
                            if(possible[j / k] == 0){
                                possible[j / k] = possible[j] + possible[k] + 1;
                            }
                        }

                        if(visited[target]){
                            r = i + 1;
                            break;
                        }
                    }
                    if(visited[target]){
                        break;
                    }
                }
                if(visited[target]){
                    break;
                }
            }

            System.out.println("#" + t + " " + r);
        }
    }
}
