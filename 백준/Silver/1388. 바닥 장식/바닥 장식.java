import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int n;
    private static int m;
    private static char[][] arr;

    public static void verti(int x, int y) {
        for (int i = x; i < n; i++) {
            if (arr[i][y] != '|') {
                break;
            }
            arr[i][y] = '.';
        }
    }

    public static void hori(int x, int y) {
        for (int i = y; i < m; i++) {
            if (arr[x][i] != '-') {
                break;
            }
            arr[x][i] = '.';
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            String inputs = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = inputs.charAt(j);
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == '-') {
                    hori(i, j);
                    count++;
                }
                if (arr[i][j] == '|') {
                    verti(i, j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}