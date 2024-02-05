import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static boolean[][] visited;
    static int m;
    static int n;
    static int[] dh = {-1, 1, 0, 0};
    static int[] dw = {0, 0, -1, 1};
    static boolean isPass;

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        if (x == m - 1 && arr[x][y] == 0) {
            isPass = true;
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nh = x + dh[i];
            int nw = y + dw[i];

            if (nh > -1 && nw > -1 && nh < m && nw < n) {
                if (!visited[nh][nw] && arr[nh][nw] == 0) {
                    dfs(nh, nw);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        arr = new int[m][n];
        visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            String[] inputs = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(inputs[j]);
            }
        }

        for (int j = 0; j < n; j++) {
            if (!visited[0][j] && arr[0][j] == 0) {
                dfs(0, j);
            }
        }

        System.out.println(isPass ? "YES" : "NO");
    }
}