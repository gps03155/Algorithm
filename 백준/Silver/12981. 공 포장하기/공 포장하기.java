import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int g = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int min = Math.min(r, Math.min(g, b));
        r -= min;
        g -= min;
        b -= min;

        int result = min;
        // 3개
        result += r / 3;
        result += g / 3;
        result += b / 3;

        r %= 3;
        g %= 3;
        b %= 3;

        // 3개 이후에는 2개 or 1개만 남음
        // 2개
        if (r == 2) {
            result++;
            r %= 2;
        } else if (g == 2) {
            result++;
            g %= 2;
        } else if (b == 2) {
            result++;
            b %= 2;
        }

        // 1개
        if (r + g + b > 0) {
            result++;
        }
        System.out.println(result);
    }
}