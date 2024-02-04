import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static List<Integer>[] list;
    static boolean[] visited;
    static int[] answer;

    public static void dfs(int n) {
        visited[n] = true;

        for (int i : list[n]) {
            if (!visited[i]) {
                dfs(i);
                answer[i] = n;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        list = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        answer = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list[x].add(y);
            list[y].add(x);
        }

        dfs(1);
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < answer.length; i++) {
            sb.append(answer[i]).append("\n");
        }
        System.out.println(sb);
    }
}