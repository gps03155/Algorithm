class Solution {
    public int solution(int n) {
        int answer = 0;
        
        StringBuilder builder = new StringBuilder();
		
	while(true) {
		builder.append(n%3);
		n /= 3;
		if(n == 0) break;
	}
		
	// 3진법 
//	builder.reverse();
		
    // 두번째 파라미터에 변환될 숫자의 진수 추가 
	answer = Integer.parseInt(builder.toString(), 3);
		
        return answer;
    }
}
