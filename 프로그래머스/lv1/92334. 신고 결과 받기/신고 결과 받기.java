import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Set<String>> map = new HashMap<>();

        for (String str : report) {
            String[] user = str.split(" ");
            Set<String> ids = map.getOrDefault(user[1], new HashSet<String>());
            ids.add(user[0]);
            map.put(user[1], ids);
        }

        int[] answer = new int[id_list.length];
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            Set<String> ids = entry.getValue();
            if (ids.size() < k) continue;
            for (String id : ids) {
                answer[Arrays.asList(id_list).indexOf(id)]++;
            }
        }

        return answer;
    }
}