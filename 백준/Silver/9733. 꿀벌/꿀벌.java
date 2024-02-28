import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        int total = 0;
        Map<String, Integer> map = new HashMap<>();
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                String todo = st.nextToken();
                map.put(todo, map.getOrDefault(todo, 0) + 1);
                total++;
            }
        }

        String[] keys = {"Re", "Pt", "Cc", "Ea", "Tb", "Cm", "Ex"};
        StringBuilder sb = new StringBuilder();
        for (String key : keys) {
            int count = 0;
            double ratio = 0.0;

            if (map.containsKey(key)) {
                count = map.get(key);
                ratio = (double) map.get(key) / total;
            }

            sb.append(key).append(" ")
              .append(count).append(" ")
              .append(String.format("%.2f", ratio))
              .append("\n");
        }
        System.out.print(sb);
        System.out.printf("Total %d 1.00", total);
    }
}