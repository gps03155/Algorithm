class Solution {
    public int solution(double num) {
        int count = 0;
        
        if(num == 1){
            return 0;
        }
		
	while(true) {
           if(num == 1 || count >= 500) {
		break;
	   }
            
	   if(num%2 == 0) {
		num /= 2;
	   }
	   else {
	       num *= 3;
	       num += 1;
	   }
			
	   count++;
        }
		
	int answer = count >= 500? -1 : count;
        return answer;
    }
}
