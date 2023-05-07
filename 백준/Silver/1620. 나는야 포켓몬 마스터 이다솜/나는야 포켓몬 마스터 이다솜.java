import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> name = new HashMap<>();
        Map<Integer, String> rank = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            name.put(input, i + 1);
            rank.put(i + 1, input);
        }

        for (int i = 0; i < m; i++) {
            String input = br.readLine();
            System.out.println(name.containsKey(input) ? name.get(input) : rank.get(Integer.parseInt(input)));
        }
    }
}