import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static List<Integer>[] list;
    static boolean[] visited;
    static int[] counts;

    public static void dfs(int x) {
        visited[x] = true;
        counts[x]++;
        for (Integer i : list[x]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }

    public static void bfs(int x) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(x);
        visited[x] = true;
        counts[x]++;

        while (!queue.isEmpty()) {
            Integer head = queue.poll();
            for (Integer i : list[head]) {
                if (!visited[i]) {
                    counts[i]++;
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        list = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        counts = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list[x].add(y);
        }

        for (int i = 1; i < n + 1; i++) {
            visited = new boolean[n + 1];
//            dfs(i);
            bfs(i);
        }

        int max = 0;
        for (int count : counts) {
            if (count > max) {
                max = count;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < n + 1; i++) {
            if (max == counts[i]) {
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);
    }
}