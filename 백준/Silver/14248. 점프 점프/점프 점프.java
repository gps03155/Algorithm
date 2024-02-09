import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static List<Integer>[] list;
    static boolean[] visited;
    static int count;

    public static void dfs(int x) {
        visited[x] = true;
        int num = list[x].get(0);
        count++;

        for (int i = 1; i < list.length; i++) {
            int start = x - num;
            int end = x + num;

            if (start > 0 && !visited[start]) {
                dfs(start);
            }
            if (end < list.length && !visited[end]) {
                dfs(end);
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

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n + 1; i++) {
            int x = Integer.parseInt(st.nextToken());
            list[i].add(x);
        }

        dfs(Integer.parseInt(br.readLine()));
        System.out.println(count);
    }
}