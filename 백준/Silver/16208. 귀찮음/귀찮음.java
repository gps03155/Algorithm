import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] sticks = new int[n];

        int total = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            sticks[i] = Integer.parseInt(st.nextToken());
            total += sticks[i];
        }

        int result = 0;
        for (int stick : sticks) {
            total -= stick;
            result += total * stick;
        }

        System.out.println(result);
    }
}