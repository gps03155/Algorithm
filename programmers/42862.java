import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        
        List<Integer> lostList = Arrays.stream(lost).sorted().boxed().collect(Collectors.toList());
	List<Integer> reserveList = Arrays.stream(reserve).sorted().boxed().collect(Collectors.toList());
		
	List<Integer> newLostList = lostList.stream().filter(m -> !reserveList.contains(m)).collect(Collectors.toList());
	List<Integer> newReserveList = reserveList.stream().filter(m -> !lostList.contains(m)).collect(Collectors.toList());
		
	for(int i=1;i<=n;i++) {
		if(newLostList.contains(i)) {
			if(newReserveList.contains(i)) {
				newReserveList.remove(newReserveList.indexOf(i));
				continue;
			}
			else if(newReserveList.contains(i-1)) {
				newReserveList.remove(newReserveList.indexOf(i-1));
				continue;
			}
			else if(newReserveList.contains(i+1)) {
				newReserveList.remove(newReserveList.indexOf(i+1));
				continue;
			}
			
			answer--;
		}
	}
        
        return answer;
    }
}
