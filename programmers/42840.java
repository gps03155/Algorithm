import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> answerList = Arrays.stream(answers).boxed().collect(Collectors.toList());
		List<Integer> answer1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> answer2 = Arrays.asList(2, 1, 2, 3, 2, 4, 2, 5);
		List<Integer> answer3 = Arrays.asList(3, 3, 1, 1, 2, 2, 4, 4, 5, 5);
		
		List<Integer> people1 = new ArrayList<>();
		List<Integer> people2 = new ArrayList<>();
		List<Integer> people3 = new ArrayList<>();
		
		List<Integer> answersList = new ArrayList<>();
		List<Integer> result = new ArrayList<>();
		
		int peopleCount1 = 0;
		int peopleCount2 = 0;
		int peopleCount3 = 0;
		
		for(int i=0; i<answers.length; i++) {
			if(people1.size() < answers.length) people1.addAll(answer1);
			if(people2.size() < answers.length) people2.addAll(answer2);
			if(people3.size() < answers.length) people3.addAll(answer3);
			if(answersList.size() < answers.length) answersList.addAll(answerList);
		}
		
		for(int i=0; i<answers.length; i++) {
			if(people1.get(i) == answersList.get(i)) peopleCount1++;
			if(people2.get(i) == answersList.get(i)) peopleCount2++;
			if(people3.get(i) == answersList.get(i)) peopleCount3++;
		}
		
		int max = IntStream.of(peopleCount1, peopleCount2, peopleCount3).max().getAsInt();
		
		if(max == peopleCount1) result.add(1);
		if(max == peopleCount2) result.add(2);
		if(max == peopleCount3) result.add(3);
		
		int[] answer = result.stream().sorted().mapToInt(m -> m).toArray();
        
        return answer;
    }
}
