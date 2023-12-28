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

        Map<Integer, Double> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int people = Integer.parseInt(st.nextToken());
                map.put(people, Math.max(map.getOrDefault(people, 0.0), Double.parseDouble(st.nextToken())));
            }
        }

        List<Map.Entry<Integer, Double>> list = new LinkedList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        double max = 0.0;
        for (int i = 0; i < k; i++) {
            max += list.get(i).getValue();
        }

        System.out.println(Math.round(max * 100.0) / 100.0);
    }
}