import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static char[][] arr;
    static boolean[][] visited;
    static int[] dh = {-1, 1, 0, 0};
    static int[] dw = {0, 0, -1, 1};
    static int n, m, answer;

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        if (arr[x][y] == 'P') {
            answer++;
        }

        for (int i = 0; i < 4; i++) {
            int nh = x + dh[i];
            int nw = y + dw[i];
            if (nh > -1 && nw > -1 && nh < n && nw < m) {
                if (!visited[nh][nw] && arr[nh][nw] != 'X') {
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
        arr = new char[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && arr[i][j] == 'I') {
                    dfs(i, j);
                }
            }
        }
        System.out.println(answer > 0 ? answer : "TT");
    }
}