import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static int[][] arr;
    static boolean[][] visited;
    static int n, size;
    static int[] dh = {-1, 1, 0, 0};
    static int[] dw = {0, 0, -1, 1};

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        size++;

        for (int i = 0; i < 4; i++) {
            int nh = x + dh[i];
            int nw = y + dw[i];

            if (nh > -1 && nw > -1 && nh < n && nw < n) {
                if (!visited[nh][nw] && arr[nh][nw] == 1) {
                    dfs(nh, nw);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = Character.getNumericValue(input.charAt(j));
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && arr[i][j] == 1) {
                    size = 0;
                    dfs(i, j);
                    list.add(size);
                }
            }
        }
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (Integer i : list) {
            sb.append(i).append("\n");
        }
        System.out.println(list.size());
        System.out.println(sb);
    }
}