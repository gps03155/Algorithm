import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        // case1
        /*
        int[] answer = Arrays.stream(arr).filter(m -> m != Arrays.stream(arr).min().getAsInt()).toArray();
		
        if(answer.length == 0) {
          answer = new int[arr.length];
          answer[answer.length - 1] = -1;
        }
        */
        
        // case2
        int[] answer = {};
        
        if(arr.length <= 1) return answer = new int[]{-1};
        answer = Arrays.stream(arr).filter(m -> m != Arrays.stream(arr).min().getAsInt()).toArray();
        
        return answer;
    }
}
