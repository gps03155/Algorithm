import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    ;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] pSum1 = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        pSum1[0] = Long.parseLong(st.nextToken());
        for (int i = 1; i < n; i++) {
            pSum1[i] = pSum1[i - 1] + Long.parseLong(st.nextToken());
        }

        long[] pSum2 = new long[n];
        st = new StringTokenizer(br.readLine());
        pSum2[0] = Long.parseLong(st.nextToken());
        for (int i = 1; i < n; i++) {
            pSum2[i] = pSum2[i - 1] + Long.parseLong(st.nextToken());
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (pSum1[i] == pSum2[i]) {
                count = i + 1;
            }
        }
        System.out.println(count);
    }
}