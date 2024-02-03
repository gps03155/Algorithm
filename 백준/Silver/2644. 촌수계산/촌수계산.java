import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int[][] arr;
    private static boolean[] visited;
    private static int end;
    private static int answer;

    private static void dfs(int x, int depth) {
        visited[x] = true;
        if (x == end) {
            answer = depth;
            return;
        }

        for (int i : arr[x]) {
            if (!visited[i]) {
                dfs(i, depth + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        arr = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y] = y;
            arr[y][x] = x;
        }

        dfs(start, 0);
        System.out.println(answer > 0 ? answer : -1);
    }
}