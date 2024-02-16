import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] arr;
    static boolean[][] visited;
    static int n, m, size;
    static int[] dh = {-1, 1, 0, 0};
    static int[] dw = {0, 0, 1, -1};

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        size++;

        for (int i = 0; i < 4; i++) {
            int nh = x + dh[i];
            int nw = y + dw[i];

            if (nh > -1 && nw > -1 && nh < n + 1 && nw < m + 1) {
                if (!visited[nh][nw] && arr[nh][nw]) {
                    dfs(nh, nw);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        arr = new boolean[n + 1][m + 1];
        visited = new boolean[n + 1][m + 1];

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y] = true;
        }

        int answer = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (!visited[i][j] && arr[i][j]) {
                    size = 0;
                    dfs(i, j);
                    answer = Math.max(answer, size);
                }
            }
        }

        System.out.println(answer);
    }
}