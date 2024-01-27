import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        long[] arr = new long[a + 1];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < a; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

        long[] pSum = new long[a + 1];
        pSum[1] = arr[1];
        for (int i = 2; i < a + 1; i++) {
            pSum[i] = pSum[i - 1] + arr[i];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            sb.append(pSum[end] - pSum[start - 1]).append("\n");
        }
        System.out.println(sb);
    }
}