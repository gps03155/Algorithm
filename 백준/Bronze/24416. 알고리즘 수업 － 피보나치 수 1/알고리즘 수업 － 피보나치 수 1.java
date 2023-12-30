import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    static int recursiveCount = 0;
    static int dpCount = 0;
    static int[] dp = new int[41];

    public static int getRecursiveFibo(int n) {
        if (n == 1 || n == 2) {
            recursiveCount++;
            return 1;
        }

        return getRecursiveFibo(n - 1) + getRecursiveFibo(n - 2);
    }

    public static int getDpFibo(int n) {
        dp[1] = dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dpCount++;
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        getRecursiveFibo(n);
        getDpFibo(n);
        System.out.println(recursiveCount + " " + dpCount);
    }
}