import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);

        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = score.length - 1; i >= 0; i--) {
            if (list.size() < m) {
                list.add(score[i]);
            }
            if (list.size() >= m) {
                int p = Math.min(Collections.min(list), k);
                answer += p * m;
                list.clear();
            }
        }

        return answer;
    }
}