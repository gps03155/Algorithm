import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] arr = new long[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        long[] pSum = new long[n + 1];
        pSum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            pSum[i] = pSum[i - 1] + arr[i];
        }

        long answer = 0;
        for (int i = 0; i < n; i++) {
            answer += arr[i] * (pSum[n - 1] - pSum[i]);
        }
        System.out.println(answer);
    }
}