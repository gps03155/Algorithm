import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int[][] arr;
    private static boolean[][] visited;
    private static int n;
    private static int m;

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        if (x - 1 > -1) {
            if (!visited[x - 1][y] && arr[x - 1][y] != 0) {
                dfs(x - 1, y);
            }
        }
        if (x + 1 < n) {
            if (!visited[x + 1][y] && arr[x + 1][y] != 0) {
                dfs(x + 1, y);
            }
        }
        if (y - 1 > -1) {
            if (!visited[x][y - 1] && arr[x][y - 1] != 0) {
                dfs(x, y - 1);
            }
        }
        if (y + 1 < m) {
            if (!visited[x][y + 1] && arr[x][y + 1] != 0) {
                dfs(x, y + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            arr = new int[n][m];
            visited = new boolean[n][m];

            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                arr[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }

            int count = 0;
            for (int j = 0; j < n; j++) {
                for (int p = 0; p < m; p++) {
                    if (arr[j][p] == 1 && !visited[j][p]) {
                        dfs(j, p);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }
}