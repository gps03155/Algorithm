import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
       Arrays.sort(people);

        int start = 0, end = people.length - 1, count = 0;
        while (start <= end) {
            int sum = people[start] + people[end];

            if (sum > limit) {
                end--;
            } else {
                start++;
                end--;
            }

            count++;
        }

        return count;
    }
}