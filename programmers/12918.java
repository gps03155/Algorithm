import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        try {
            if(!Arrays.asList(4, 6).contains(s.length())){
                return false;
            }
            
			int num = Integer.parseInt(s);
		}
		catch(NumberFormatException e) {
			answer = false;
		}
        
        return answer;
    }
}
