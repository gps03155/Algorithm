import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int result = 0;
        while (n-- > 0) {
            long count = br.readLine().chars().filter(c -> c == 'O').count();
            if (count >= (m + 1) / 2) {
                result++;
            }
        }
        System.out.println(result);
    }
}