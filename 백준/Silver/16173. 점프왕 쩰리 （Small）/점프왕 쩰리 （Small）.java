import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int[][] arr;
    private static boolean[][] visited;
    private static int n;

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        int newX = x + arr[x][y];
        int newY = y + arr[x][y];

        if (newY < n) {
            if (!visited[x][newY]) {
                dfs(x, newY);
            }
        }

        if (newX < n) {
            if (!visited[newX][y]) {
                dfs(newX, y);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visited = new boolean[n][n];
        dfs(0, 0);

        System.out.println(visited[n - 1][n - 1] ? "HaruHaru" : "Hing");
    }
}