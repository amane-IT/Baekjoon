class 타겟넘버 {
    static int answer = 0;
    public int solution(int[] numbers, int target) {
        
        dfs(0, target, numbers);
        
        return answer;
    }
    
    static void dfs(int idx, int target, int[] numbers){
        if(idx == numbers.length){
            int sum = 0;
            
            for(int i = 0; i < numbers.length; i++){
                sum += numbers[i];
            }
            
            if(sum == target)
                answer++;
            
            return;
        }
        
        numbers[idx] *= 1;
        dfs(idx + 1, target, numbers);
        
        numbers[idx] *= -1;
        dfs(idx + 1, target, numbers);
    }
}
