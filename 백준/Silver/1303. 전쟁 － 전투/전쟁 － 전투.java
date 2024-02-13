import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static char[][] arr;
    static boolean[][] visited;
    static int n, m, wCount, bCount;
    static int[] dh = {-1, 1, 0, 0};
    static int[] dw = {0, 0, -1, 1};

    public static void dfs(int x, int y, char team) {
        visited[x][y] = true;
        switch (team) {
            case 'W':
                wCount++;
                break;
            case 'B':
                bCount++;
                break;
        }

        for (int i = 0; i < 4; i++) {
            int nh = x + dh[i];
            int nw = y + dw[i];
            if (nh > -1 && nw > -1 && nh < m && nw < n) {
                if (!visited[nh][nw] && arr[nh][nw] == team) {
                    dfs(nh, nw, team);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new char[m][n];
        visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        long wAns = 0, bAns = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && arr[i][j] == 'W') {
                    dfs(i, j, 'W');
                    wAns += (long) wCount * wCount;
                    wCount = 0;
                }
                if (!visited[i][j] && arr[i][j] == 'B') {
                    dfs(i, j, 'B');
                    bAns += (long) bCount * bCount;
                    bCount = 0;
                }
            }
        }

        System.out.println(wAns + " " + bAns);
    }
}