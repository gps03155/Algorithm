class Solution {
    // 재귀함수는 불필요 연산으로 인해 시간 초과 => Bottom-Up 방식으로 풀어야함
    public int fibo(int n) {
      if(n == 0) return 0;
      else if(n == 1) return 1;
      else return (fibo(n-2) + fibo(n-1)) % 1234567;
	}
	
    public int solution(int n) {
        int answer = 0;
        
	// answer = fibo(n);
        int first = 1;
        int second = 0;
        
        for(int i=2; i<=n; i++){
            answer = (first + second) % 1234567;
            
            second = first;
            first = answer;
        }
		
        return answer;
    }
}
