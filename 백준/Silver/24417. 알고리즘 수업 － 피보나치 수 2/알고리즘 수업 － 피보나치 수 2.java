import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static long recursiveFibo(long n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        int x, y, z;
        x = y = 1;
        for (int i = 3; i <= n; i++) {
            z = y;
            y = (x + y) % 1000000007;
            x = z;
        }

        return y;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        System.out.println(recursiveFibo(n) + " " + (n - 2));
    }
}