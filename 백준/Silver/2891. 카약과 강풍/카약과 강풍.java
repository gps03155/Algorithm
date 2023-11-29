import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int[] boats = new int[n];
        Arrays.fill(boats, 1);

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            boats[Integer.parseInt(st.nextToken()) - 1]--;
        }

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            boats[Integer.parseInt(st.nextToken()) - 1]++;
        }

        for (int i = 0; i < n; i++) {
            if (boats[i] > 1) {
                if (i - 1 > -1 && boats[i - 1] < 1) {
                    boats[i - 1]++;
                    boats[i]--;
                } else if (i + 1 < n && boats[i + 1] < 1) {
                    boats[i + 1]++;
                    boats[i]--;
                }
            }
        }

        int count = 0;
        for (int boat : boats) {
            if (boat == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}