import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static List<Integer>[] list;
    static int[] visited;
    static int count = 1;

    public static void dfs(int x) {
        visited[x] = count;
        for (Integer i : list[x]) {
            if (visited[i] == 0) {
                count++;
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        list = new ArrayList[n + 1];
        visited = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list[x].add(y);
            list[y].add(x);
        }

        for (int i = 0; i < n + 1; i++) {
            list[i].sort(Collections.reverseOrder());
        }

        dfs(r);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < visited.length; i++) {
            sb.append(visited[i]).append("\n");
        }

        System.out.println(sb);
    }
}