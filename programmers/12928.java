import java.util.OptionalInt;
import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        OptionalInt sum = IntStream.range(1, n+1).filter(m -> n % m == 0).reduce((total, num) -> total + num);
		answer = sum.isPresent()? sum.getAsInt() : 0;
        
        return answer;
    }
}
