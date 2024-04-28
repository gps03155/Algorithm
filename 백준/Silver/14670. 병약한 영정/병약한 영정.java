import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            map.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            boolean isContains = true;
            List<Integer> list = new ArrayList<>();
            while (st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());
                if (!map.containsKey(num)) {
                    isContains = false;
                    break;
                }
                list.add(num);
            }

            if (!isContains) {
                sb.append("YOU DIED").append("\n");
                continue;
            }

            for (Integer integer : list) {
                sb.append(map.get(integer)).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}