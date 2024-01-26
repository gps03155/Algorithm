import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[] arr = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        long cur = 0;
        for (int i = 0; i < m; i++) {
            cur += arr[i];
        }
        long answer = cur;
        for (int i = 1; i < n - m + 1; i++) {
            cur = cur - arr[i - 1] + arr[i + m - 1];
            answer = Math.max(answer, cur);
        }
        System.out.println(answer);
    }
}