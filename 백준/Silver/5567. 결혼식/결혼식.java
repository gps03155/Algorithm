import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static List<Integer>[] arr;
    static boolean[] visited;

    public static void dfs(int x, int depth) {
        if (depth == 3) {
            return;
        }

        for (Integer integer : arr[x]) {
            visited[x] = true;
            dfs(integer, depth + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        arr = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < n + 1; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }

        dfs(1, 0);

//        System.out.println(Arrays.toString(visited));
        int answer = 0;
        for (int i = 2; i < visited.length; i++) {
            if (visited[i]) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}