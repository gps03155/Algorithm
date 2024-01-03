import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long max = 0, min = Long.MAX_VALUE;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(st.nextToken());
            if (num < min) {
                min = num;
            } else {
                max = Math.max(max, num - min);
            }
            sb.append(max).append(" ");
        }
        System.out.println(sb);
    }
}