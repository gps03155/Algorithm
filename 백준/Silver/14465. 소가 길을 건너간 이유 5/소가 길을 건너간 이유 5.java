import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    ;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] arr = new int[n + 1];
        for (int i = 0; i < b; i++) {
            arr[Integer.parseInt(br.readLine())] = 1;
        }

        int cur = 0;
        for (int i = 1; i <= k; i++) {
            cur += arr[i];
        }

        int answer = cur;
        for (int i = 2; i <= n - k + 1; i++) {
            cur = cur - arr[i - 1] + arr[i + k - 1];
            answer = Math.min(cur, answer);
        }
        System.out.println(answer);
    }
}