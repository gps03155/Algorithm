import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean isPrime(long n) {
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            long n = Long.parseLong(br.readLine());

            if (n == 0 || n == 1 || n == 2) {
                System.out.println(2);
                continue;
            }

            long increment = n;
            while (true) {
                if (isPrime(increment)) {
                    System.out.println(increment);
                    break;
                }
                increment++;
            }
        }
    }
}