import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long t = Long.parseLong(st.nextToken());
        long total = Long.parseLong(st.nextToken());
        long max = Long.parseLong(st.nextToken());

        Map<String, Long> people = new HashMap<>();
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            people.put(st.nextToken(), Long.parseLong(st.nextToken()));
        }

        List<Map.Entry<String, Long>> list = new ArrayList<>(people.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        Map<String, Long> map = new LinkedHashMap<>();
        for (Map.Entry<String, Long> entry : list) {
            total -= entry.getValue();
            map.put(entry.getKey(), entry.getValue());
            max--;

            if (max <= 0 && total > 0) {
                System.out.println("impossible");
                return;
            }

            if (total <= 0) {
                break;
            }
        }

        System.out.println(map.keySet().size());
        for (String name : map.keySet()) {
            System.out.println(name + ", YOU ARE FIRED!");
        }
    }
}