import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] days = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            days[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0, maxPrice = 0;
        for (int i = days.length - 1; i >= 0; i--) {
            if (days[i] > maxPrice) {
                maxPrice = days[i];
            }

            max = Math.max(max, maxPrice - days[i]);
        }

        System.out.println(max);
    }
}