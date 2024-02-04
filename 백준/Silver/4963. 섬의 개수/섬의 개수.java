import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int[][] arr;
    private static boolean[][] visited;
    private static int w;
    private static int h;

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        if (x - 1 > -1) {
            if (!visited[x - 1][y] && arr[x - 1][y] == 1) {
                dfs(x - 1, y);
            }
            if (y + 1 < w) {
                if (!visited[x - 1][y + 1] && arr[x - 1][y + 1] == 1) {
                    dfs(x - 1, y + 1);
                }
            }
            if (y - 1 > -1) {
                if (!visited[x - 1][y - 1] && arr[x - 1][y - 1] == 1) {
                    dfs(x - 1, y - 1);
                }
            }
        }
        if (x + 1 < h) {
            if (!visited[x + 1][y] && arr[x + 1][y] == 1) {
                dfs(x + 1, y);
            }
            if (y + 1 < w) {
                if (!visited[x + 1][y + 1] && arr[x + 1][y + 1] == 1) {
                    dfs(x + 1, y + 1);
                }
            }
            if (y - 1 > -1) {
                if (!visited[x + 1][y - 1] && arr[x + 1][y - 1] == 1) {
                    dfs(x + 1, y - 1);
                }
            }
        }
        if (y - 1 > -1) {
            if (!visited[x][y - 1] && arr[x][y - 1] == 1) {
                dfs(x, y - 1);
            }
        }
        if (y + 1 < w) {
            if (!visited[x][y + 1] && arr[x][y + 1] == 1) {
                dfs(x, y + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if (w == 0 && h == 0) {
                break;
            }

            arr = new int[h][w];
            visited = new boolean[h][w];

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int count = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (!visited[i][j] && arr[i][j] == 1) {
                        dfs(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}