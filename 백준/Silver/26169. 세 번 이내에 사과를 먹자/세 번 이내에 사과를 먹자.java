import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int[][] arr = new int[5][5];
    private static boolean isApple;

    private static void dfs(int x, int y, int move, int apple, boolean[][] visited) {
        visited[x][y] = true;
        if (arr[x][y] == 1) {
            apple++;
        }

        if (move == 3) {
            if (apple >= 2) {
                isApple = true;
            }
            return;
        }

        if (x - 1 >= 0 && arr[x - 1][y] != -1) {
            if (!visited[x - 1][y]) {
                dfs(x - 1, y, move + 1, apple, visited);
                visited[x - 1][y] = false;
            }
        }
        if (x + 1 < 5 && arr[x + 1][y] != -1) {
            if (!visited[x + 1][y]) {
                dfs(x + 1, y, move + 1, apple, visited);
                visited[x + 1][y] = false;
            }
        }
        if (y - 1 >= 0 && arr[x][y - 1] != -1) {
            if (!visited[x][y - 1]) {
                dfs(x, y - 1, move + 1, apple, visited);
                visited[x][y - 1] = false;
            }
        }
        if (y + 1 < 5 && arr[x][y + 1] != -1) {
            if (!visited[x][y + 1]) {
                dfs(x, y + 1, move + 1, apple, visited);
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

        boolean[][] visited = new boolean[5][5];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        dfs(x, y, 0, 0, visited);
        System.out.println(isApple ? 1 : 0);
    }
}