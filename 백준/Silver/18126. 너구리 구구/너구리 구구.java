import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static List<long[]>[] list;
    static boolean[] visited;
    static long answer = Integer.MIN_VALUE;

    public static void dfs(int x, long sum) {
        visited[x] = true;
        answer = Math.max(answer, sum);
        for (long[] ints : list[x]) {
            if (!visited[(int) ints[0]]) {
                dfs((int) ints[0], sum + ints[1]);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        list = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < n + 1; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            list[a].add(new long[]{b, c});
            list[b].add(new long[]{a, c});
        }

        dfs(1, 0);
        System.out.println(answer);
    }
}