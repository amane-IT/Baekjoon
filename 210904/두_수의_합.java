import java.util.*;

class 두_수의_합 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int target = sc.nextInt();
        
        Arrays.sort(arr);
        
        int start = 0;
        int end = n - 1;
        int cnt = 0;
        
        while(start < end) {
            int sum = arr[start] + arr[end];

            if(sum == target)
                cnt++;

            if (sum <= target)
                start++;
            else
                end--;
        }
        
        System.out.println(cnt);
    }
}
