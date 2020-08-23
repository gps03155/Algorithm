class Solution {
    public String solution(String s) {
        String[] strArr = s.split("");
		String answer = "";
		int index = 0;
		
		for(String str : strArr) {
            if(str.isBlank()) {
            	index = 0; 
				answer += str;
				
				continue;
			}
			
			if(index % 2 == 0) {
				str = str.toUpperCase();
			}
			else {
				str = str.toLowerCase();
			}
			
			answer += str;
			index++;
		}
        
        return answer;
    }
}
