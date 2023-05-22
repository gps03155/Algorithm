import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int hour = 24, tired = 0, work = 0;

        while (hour > 0) {
            hour--;

            if (tired + a <= d) {
                tired += a;
                work += b;
            } else {
                tired = Math.max(tired - c, 0);
            }
        }

        System.out.println(work);
    }
}