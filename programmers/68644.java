import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        Set<Integer> set = new HashSet<Integer>();
		
	for(int i=0;i<numbers.length;i++) {
		List<Integer> otherNumberList = IntStream.of(numbers).boxed().collect(Collectors.toList());
		otherNumberList.remove(i);

		for(int otherNum : otherNumberList) {
			set.add(numbers[i] + otherNum);
		}
	}
		
	answer = set.stream().sorted().mapToInt(Integer::intValue).toArray();
		
        return answer;
    }
}
