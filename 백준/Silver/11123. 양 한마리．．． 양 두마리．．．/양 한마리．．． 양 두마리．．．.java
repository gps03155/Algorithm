import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static char[][] arr;
    static boolean[][] visited;
    static int h;
    static int w;
    static int[] dh = {-1, 1, 0, 0};
    static int[] dw = {0, 0, 1, -1};

    static public void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nh = x + dh[i];
            int nw = y + dw[i];

            if (nh > -1 && nw > -1 && nh < h && nw < w) {
                if (!visited[nh][nw] && arr[nh][nw] == '#') {
                    dfs(nh, nw);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            h = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());

            arr = new char[h][w];
            visited = new boolean[h][w];

            for (int i = 0; i < h; i++) {
                arr[i] = br.readLine().toCharArray();
            }

            int count = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (!visited[i][j] && arr[i][j] == '#') {
                        dfs(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}