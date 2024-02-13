import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static char[][] arr;
    static boolean[][] visited;
    static int r, c, k, count;
    static int[] dh = {-1, 1, 0, 0};
    static int[] dw = {0, 0, -1, 1};

    public static void dfs(int x, int y, int depth) {
        visited[x][y] = true;

        if (x == 0 && y == c - 1) {
            if (depth == k) {
                count++;
                return;
            }
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nh = x + dh[i];
            int nw = y + dw[i];
            if (nh > -1 && nw > -1 && nh < r && nw < c) {
                if (!visited[nh][nw] && arr[nh][nw] != 'T') {
                    dfs(nh, nw, depth + 1);
                    visited[nh][nw] = false;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new char[r][c];
        visited = new boolean[r][c];

        for (int i = 0; i < r; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        dfs(r - 1, 0, 1);
        System.out.println(count);
    }
}