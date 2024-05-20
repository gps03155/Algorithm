import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        Map<String, Integer> map = new HashMap<>();
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String q = st.nextToken();

            switch (q) {
                case "+":
                    map.put(name, map.getOrDefault(name, 0) + 1);
                    break;
                default:
                    if (map.getOrDefault(name, 0) > 0) {
                        map.put(name, map.getOrDefault(name, 0) - 1);
                    } else {
                        count++;
                    }
                    break;
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            count += entry.getValue();
        }
        System.out.println(count);
    }
}