import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String num = "";
        
        String[] arr = String.valueOf(n).split("");
	Arrays.sort(arr, Collections.reverseOrder());
		
	for(String str : arr) {
		num += str;
	}
        
        answer = Long.valueOf(num);
        
        return answer;
    }
}
