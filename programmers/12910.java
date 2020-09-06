import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        List<Integer> list = IntStream.of(arr).filter(m -> m % divisor == 0).sorted().boxed().collect(Collectors.toList());
	if(list.isEmpty()) list.add(-1);
        
        answer = list.stream().mapToInt(m -> m).toArray();
        
        return answer;
    }
}
