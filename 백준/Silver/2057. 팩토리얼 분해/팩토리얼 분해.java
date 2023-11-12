import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        if (n == 0) {
            System.out.println("NO");
            return;
        }

        long[] factorial = new long[20];
        factorial[0] = 1;
        factorial[1] = 1;

        for (int i = 2; i < 20; i++) {
            factorial[i] = i * factorial[i - 1];
        }

        for (int i = 19; i >= 0; i--) {
            if (n >= factorial[i]) {
                n -= factorial[i];
            }
            if (n == 0) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}