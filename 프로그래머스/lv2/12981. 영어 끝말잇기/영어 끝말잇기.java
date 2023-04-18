import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> exist = new HashSet<>(Collections.singleton(words[0]));
        int count = 1, people = 1;
        for (int i = 1; i < words.length; i++) {
            people %= n;
            people++;

            if (i % n == 0) {
                count++;
            }

            if (words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
               return new int[]{people, count};
            }

            if (exist.contains(words[i])) {
               return new int[]{people, count};
            }

            exist.add(words[i]);
        }

       return new int[]{0, 0};
    }
}