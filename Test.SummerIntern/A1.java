public class A1 {

    public static int solution(int[][] atmos) {
        int answer = 0;

        int isUsed = 0;

        for(int i = 0; i < atmos.length; i++){
            int dust = atmos[i][0];
            int tiny = atmos[i][1];

            int d = isDust(dust);
            int t = isTinyDust(tiny);

            if(d >= 1 || t >= 1){
                // 둘 다 매우 나쁨 상태
                if(d == 2 && t == 2){
                    if(isUsed == 0)
                        answer++;
                    isUsed = 0;
                    continue;
                }
                // 둘 중 하나만 나쁨

                // 첫 사용
                if(isUsed == 0){
                    answer++;
                    isUsed++;
                } else if (isUsed < 2)
                    isUsed++;
                else{
                    isUsed = 0; // 폐기
                }
            }
            else{
                if(isUsed == 0)
                    continue;

                if(isUsed == 2){
                    isUsed = 0;
                    continue;
                }

                isUsed++;
            }

        }
        return answer;
    }

    public static int isDust(int dust){
        if(dust <= 80)
            return 0;
        else if (dust <= 150)
            return 1;
        return 2;
    }

    public static int isTinyDust(int dust){
        if(dust <= 35)
            return 0;
        else if (dust <= 75)
            return 1;
        return 2;
    }

    public static void main(String[] args) {
        int[][] atoms = {{30, 15}, {80, 35}};
            //{{140, 90}, {177, 75}, {95, 45}, {71, 31}, {150, 30}, {80, 35}, {72, 33}, {166, 81}, {151, 75}};
            //{{80, 35}, {70, 38}, {100, 41}, {75,30}, {160,80}, {77, 29}, {181, 68}, {151, 76}};
        System.out.println(solution(atoms));

    }
}
