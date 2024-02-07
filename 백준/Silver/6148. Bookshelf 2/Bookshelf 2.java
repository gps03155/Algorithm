import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static int answer = Integer.MAX_VALUE;
    static int b, n;

    public static void dfs(int x, int sum) {
        if (sum >= b) {
            answer = Math.min(answer, sum - b);
            return;
        }

        for (int i = x; i < n; i++) {
            dfs(i + 1, sum + arr[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        dfs(0, 0);
        System.out.println(answer);
    }
}