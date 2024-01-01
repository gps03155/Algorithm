import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        long[] money = new long[y + 1];
        money[0] = h;
        for (int i = 1; i <= y; i++) {
            money[i] = (long) Math.floor(1.05 * money[i - 1]);
            if (i >= 3) {
                money[i] = Math.max(money[i], (long) Math.floor((1.2 * money[i - 3])));
            }
            if (i >= 5) {
                money[i] = Math.max(money[i], (long) Math.floor(1.35 * money[i - 5]));
            }
        }

        System.out.println(money[y]);
    }
}