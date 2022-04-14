import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class BOJ_19948_음유시인영재 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int space = Integer.parseInt(br.readLine());
        boolean flag = true;

        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String answer = st.charAt(0)+"";

        char pre = st.charAt(0);
        if(nums[Character.toLowerCase(pre) - 'a'] > 0)
            nums[Character.toLowerCase(pre) - 'a']--;
        else
            flag = false;

        if(flag){
            for(int i = 1; i < st.length(); i++){
                if(pre == st.charAt(i))
                    continue;
                else if (st.charAt(i) == ' '){
                    space--;
                    if(space < 0) {
                        flag = false;
                        break;
                    }
                    pre = st.charAt(i);
                } else{
                    if(Character.isLowerCase(st.charAt(i)) && nums[st.charAt(i) - 'a'] > 0)
                        nums[st.charAt(i) - 'a']--;
                    else if (Character.isUpperCase(st.charAt(i)) && nums[st.charAt(i) - 'A'] > 0)
                        nums[st.charAt(i) - 'A']--;
                    else{
                        flag = false;
                        break;
                    }
                    if(pre == ' ')
                        answer += st.charAt(i)+"";
                    pre = st.charAt(i);
                }
            }
        }

        answer = answer.toUpperCase();
        pre = answer.charAt(0);

        if(nums[pre - 'A'] > 0)
            nums[pre - 'A']--;
        else
            flag = false;

        if(flag){
            for(int i = 1; i < answer.length(); i++){
                if(pre == answer.charAt(i))
                    continue;
                else{
                    pre = answer.charAt(i);
                    if(nums[pre - 'A'] > 0)
                        nums[pre - 'A']--;
                    else {
                        flag = false;
                        break;
                    }
                }
            }
        }

        if(!flag)
            System.out.println(-1);
        else
            System.out.println(answer);
    }
}
