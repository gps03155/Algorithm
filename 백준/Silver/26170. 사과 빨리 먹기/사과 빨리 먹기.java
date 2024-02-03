import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int[][] arr = new int[5][5];
    private static boolean[][] visited = new boolean[5][5];
    private static boolean isApple;
    private static int minMove = Integer.MAX_VALUE;

    public static void dfs(int x, int y, int move, int apple) {
        if (arr[x][y] == 1) {
            apple++;
        }
        visited[x][y] = true;

        if (apple > 2) {
            isApple = true;
            minMove = Math.min(minMove, move);
            return;
        }

        if (x - 1 > -1) {
            if (!visited[x - 1][y] && arr[x - 1][y] != -1) {
                dfs(x - 1, y, move + 1, apple);
                visited[x - 1][y] = false;
            }
        }
        if (x + 1 < 5) {
            if (!visited[x + 1][y] && arr[x + 1][y] != -1) {
                dfs(x + 1, y, move + 1, apple);
                visited[x + 1][y] = false;
            }
        }
        if (y - 1 > -1) {
            if (!visited[x][y - 1] && arr[x][y - 1] != -1) {
                dfs(x, y - 1, move + 1, apple);
                visited[x][y - 1] = false;
            }
        }
        if (y + 1 < 5) {
            if (!visited[x][y + 1] && arr[x][y + 1] != -1) {
                dfs(x, y + 1, move + 1, apple);
                visited[x][y + 1] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        dfs(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 0, 0);
        System.out.println(isApple ? minMove : -1);
    }
}