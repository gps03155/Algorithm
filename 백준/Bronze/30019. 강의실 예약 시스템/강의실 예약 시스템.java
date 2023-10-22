import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
//        int n = sc.nextInt();
//        int m = sc.nextInt();

        Map<Integer, Integer> room = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
//            int k = sc.nextInt();
//            int s = sc.nextInt();
//            int e = sc.nextInt();

            int prevEnd = room.getOrDefault(k, 0);
            boolean isAvailable = prevEnd <= s;
            sb.append(isAvailable ? "YES" : "NO").append("\n");
//            System.out.println(isAvailable ? "YES" : "NO");
            if (isAvailable) {
                room.put(k, e);
            }
        }
        System.out.println(sb);
    }
}