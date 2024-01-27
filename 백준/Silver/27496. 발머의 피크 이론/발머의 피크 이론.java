import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    ;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        long[] arr = new long[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Queue<Long> queue = new LinkedList<>();
        long sum = 0, count = 0;
        for (int i = 0; i < n; i++) {
            queue.offer(arr[i]);
            sum += arr[i];

            if (queue.size() > l) {
                sum -= queue.poll();
            }
            if (129 <= sum && sum <= 138) {
                count++;
            }
        }
        System.out.println(count);
    }
}