import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static char[][] arr;
    static boolean[][] visited;
    static int r, c, sheepCount, wolfCount;
    static int[] dh = {-1, 1, 0, 0};
    static int[] dw = {0, 0, -1, 1};

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        if (arr[x][y] == 'o') {
            sheepCount++;
        }

        if (arr[x][y] == 'v') {
            wolfCount++;
        }

        for (int i = 0; i < 4; i++) {
            int nh = x + dh[i];
            int nw = y + dw[i];

            if (nh > -1 && nw > -1 && nh < r && nw < c) {
                if (!visited[nh][nw] && arr[nh][nw] != '#') {
                    dfs(nh, nw);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        arr = new char[r][c];
        visited = new boolean[r][c];

        for (int i = 0; i < r; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        int sheepAns = 0, wolfAns = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (!visited[i][j] && arr[i][j] != '#') {
                    sheepCount = 0;
                    wolfCount = 0;
                    dfs(i, j);
                    if (sheepCount > wolfCount) {
                        sheepAns += sheepCount;
                    } else {
                        wolfAns += wolfCount;
                    }
                }
            }
        }

        System.out.println(sheepAns + " " + wolfAns);
    }
}