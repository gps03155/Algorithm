import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        Map<Integer, String> rankMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
            rankMap.put(i, players[i]);
        }

        for (int i = 0; i < callings.length; i++) {
            int rank = map.get(callings[i]);

            map.put(callings[i], rank - 1);
            String player = rankMap.get(rank - 1);
            map.put(player, rank);

            rankMap.put(rank, player);
            rankMap.put(rank - 1, callings[i]);
        }

        return rankMap.values().toArray(new String[rankMap.size()]);
    }
}