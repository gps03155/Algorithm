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

    public static void dfs(int x, int depth) {
        visited[x] = depth;
        for (Integer i : list[x]) {
            if (visited[i] == -1) {
                dfs(i, depth + 1);
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
            visited[i] = -1;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list[x].add(y);
            list[y].add(x);
        }

        for (int i = 0; i < n + 1; i++) {
            Collections.sort(list[i]);
        }

        dfs(r, 0);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < visited.length; i++) {
            sb.append(visited[i])
              .append("\n");
        }
        System.out.println(sb);
    }
}