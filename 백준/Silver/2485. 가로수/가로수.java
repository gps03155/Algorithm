import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] trees = new int[n];

        for (int i = 0; i < n; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }

        int[] diffs = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            diffs[i] = trees[i + 1] - trees[i];
        }

        int gcd = gcd(diffs[0], diffs[1]);

        for (int i = 2; i < diffs.length; i++) {
            gcd = gcd(gcd, diffs[i]);
        }

        int sum = 0;
        for (int i = 0; i < diffs.length; i++) {
            sum += diffs[i] / gcd - 1;
        }

        System.out.println(sum);
    }
}