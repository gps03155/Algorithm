import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        long cur = 0;
        for (int i = 0; i < x; i++) {
            cur += arr[i];
        }

        long people = cur, day = 1;
        for (int i = 1; i < n - x + 1; i++) {
            cur = cur - arr[i - 1] + arr[i + x - 1];
            if (cur > people) {
                people = cur;
                day = 1;
            } else if (cur == people) {
                day++;
            }
        }

        if (people > 0) {
            System.out.println(people);
            System.out.println(day);
            return;
        }

        System.out.println("SAD");
    }
}