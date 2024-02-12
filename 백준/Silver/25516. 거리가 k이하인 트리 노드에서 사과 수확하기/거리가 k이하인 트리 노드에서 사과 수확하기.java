import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    static List<Integer>[] list;
    static boolean[] visited, apples;
    static int k, count;

    public static void dfs(int x, int depth) {
        visited[x] = true;

        if (apples[x]) {
            count++;
        }

        if (depth >= k) {
            return;
        }

        for (Integer i : list[x]) {
            if (!visited[i]) {
                dfs(i, depth + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        list = new ArrayList[n];
        visited = new boolean[n];
        apples = new boolean[n];

        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list[x].add(y);
            list[y].add(x);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            apples[i] = Objects.equals(st.nextToken(), "1");
        }

        dfs(0, 0);
        System.out.println(count);
    }
}