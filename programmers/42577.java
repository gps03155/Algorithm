import java.util.*;
import java.util.stream.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
		Arrays.sort(phone_book);
		
		String phone = phone_book[0];
		
		List<String> result = Arrays.asList(phone_book).stream().filter(m -> String.valueOf(m).startsWith(String.valueOf(phone))).collect(Collectors.toList());
		
		if(result.size() > 1) answer = false;
		
		
        return answer;
    }
}
