import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            map.put(name, score);
        }

        Set<String> openNames = new HashSet<>();
        long sum = 0;
        for (int i = 0; i < k; i++) {
            String name = br.readLine();
            sum += map.getOrDefault(name, 0);
            openNames.add(name);
        }

        map.keySet().removeAll(openNames);

        long min = sum;
        long max = sum;
        if (m > k) {
            List<Integer> list = new ArrayList<>(map.values());
            Collections.sort(list);

            for (int i = 0; i < m - k; i++) {
                min += list.get(i);
            }

            for (int i = list.size() - 1; i > list.size() - 1 - (m - k); i--) {
                max += list.get(i);
            }
        }
        System.out.println(min + " " + max);
    }
}