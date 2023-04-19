import java.util.*;

class Solution {
    public List<Integer> getDivisor(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 3; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                list.add(n / i);
                list.add(i);
            }
        }

        return list;
    }
    
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        List<Integer> list = getDivisor(total);

        int width = 0, height = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) * list.get(j) == total) {
                    if (yellow == (list.get(i) - 2) * (list.get(j) - 2)) {
                        width = list.get(i);
                        height = list.get(j);
                        break;
                    }
                }
            }
        }
        
        return new int[]{width, height};
    }
}