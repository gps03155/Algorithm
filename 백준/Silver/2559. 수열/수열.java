import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        // 초기값
        long cur = 0;
        for (int i = 0; i < k; i++) {
            cur += arr[i];
        }

        long max = cur;
        for (int i = 1; i < n - k + 1; i++) {
            cur = cur - arr[i - 1] + arr[i + k - 1];
            max = Math.max(max, cur);
        }

        System.out.println(max);
    }
}