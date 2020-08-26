import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<Object, Long> count = Arrays.asList(participant).stream().collect(Collectors.groupingBy(m -> m, Collectors.counting()));
	Map<Object, Long> competionCount =  Arrays.asList(completion).stream().collect(Collectors.groupingBy(m -> m, Collectors.counting()));
        
        for(Object key : count.keySet()){
            if(competionCount.containsKey(key)){
                if(!count.get(key).equals(competionCount.get(key))){
                    answer = String.valueOf(key);
                    break;
                }
            }
            else{
                answer = String.valueOf(key);
            }
        }
        
        return answer;
    }
}
