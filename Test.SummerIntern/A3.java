public class A3 {

    // 맨해튼 거리 묻기
    public static int[] solution(String line) {
        int[] answer = new int[line.length()];

        char[][] map = {{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'}, {'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P'}};
        int[] left = {0, 1};
        int[] right = {9, 1};
        for(int i = 0; i < line.length(); i++){
            char ch = line.charAt(i);

            if(Character.isDigit(ch)){
                int idx = 9;
                if(ch != '0'){
                    idx = ch - '0' - 1;
                }

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String line = "Q4OYPI";
    }
}
