import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String game = st.nextToken();

        Map<String, Integer> map = new HashMap<>();
        map.put("Y", 1);
        map.put("F", 2);
        map.put("O", 3);

        Set<String> users = new HashSet<>();
        Set<String> beforeUsers = new HashSet<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            if (!beforeUsers.contains(name)) {
                users.add(name);
            }

            if (map.get(game) == users.size()) {
                count++;
                beforeUsers.addAll(users);
                users.clear();
            }
        }

        System.out.println(count);
    }
}