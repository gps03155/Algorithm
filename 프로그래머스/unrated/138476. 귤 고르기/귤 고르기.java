import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
class Solution {
    public int solution(int k, int[] tangerine) {
        AtomicInteger t = new AtomicInteger(k);

        Map<Integer, Integer> map = new HashMap<>();

        for (int tanger : tangerine) {
            map.put(tanger, map.getOrDefault(tanger, 0) + 1);
        }

        AtomicInteger count = new AtomicInteger();
        map.entrySet()
           .stream()
           .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
           .forEach(m -> {
               if (t.get() > 0) {
                   t.addAndGet(-m.getValue());
                   count.getAndIncrement();
               }
           });

        return count.get();
    }
}