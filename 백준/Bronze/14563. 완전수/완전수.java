import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int j = 0; j < t; j++) {
            int n = sc.nextInt();

            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && i < n) {
                    sum += i;
                }
            }

            if (sum == n) System.out.println("Perfect");
            else if (sum < n) System.out.println("Deficient");
            else if (sum > n) System.out.println("Abundant");
        }
    }
}