import java.util.*;
class Solution {
    public int solution(int[][] targets) {
        Arrays.sort(targets, (o1, o2) -> o1[1] - o2[1]);

        int count = 0, start = 0;
        for (int i = 0; i < targets.length; i++) {
            if (targets[i][0] >= start) {
                start = targets[i][1];
                count++;
            }
        }

        return count;
    }
}