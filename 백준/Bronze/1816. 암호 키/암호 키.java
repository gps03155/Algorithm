import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean[] prime;

    public static void makePrime(int num) {
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (prime[j]) {
                continue;
            }

            for (int k = j * j; k < prime.length; k += j) {
                prime[k] = true;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            long n = Long.parseLong(br.readLine());
            prime = new boolean[1000001];
            makePrime(1000000);

            boolean isPrime = true;
            for (int j = 2; j < prime.length; j++) {
                if (!prime[j]) {
                    if (n % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            System.out.println(isPrime ? "YES" : "NO");
        }
    }
}