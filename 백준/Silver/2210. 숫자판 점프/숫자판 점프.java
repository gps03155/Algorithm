import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    private static int[][] arr = new int[5][5];
    private static Set<Integer> list = new HashSet<>();

    public static void dfs(int x, int y, int depth, int num) {
        if (depth == 5) {
            list.add(num);
            return;
        }

        if (x - 1 > -1) {
            dfs(x - 1, y, depth + 1, num * 10 + arr[x - 1][y]);
        }
        if (x + 1 < 5) {
            dfs(x + 1, y, depth + 1, num * 10 + arr[x + 1][y]);
        }
        if (y - 1 > -1) {
            dfs(x, y - 1, depth + 1, num * 10 + arr[x][y - 1]);
        }
        if (y + 1 < 5) {
            dfs(x, y + 1, depth + 1, num * 10 + arr[x][y + 1]);
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
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                dfs(i, j, 0, arr[i][j]);
            }
        }
        System.out.println(list.size());
    }
}