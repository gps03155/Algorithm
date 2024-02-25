import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, String> map = new HashMap<>();
        Set<String> list = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            list.add(word);
            map.put(word, new StringBuilder(word).reverse().toString());
        }

        for (String s : list) {
            if (map.containsKey(s) && map.containsValue(s)) {
                System.out.println(s.length() + " " + s.charAt(s.length() / 2));
                return;
            }
        }
    }
}