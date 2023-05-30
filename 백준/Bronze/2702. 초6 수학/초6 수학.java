import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int gcd = gcd(a, b);
            System.out.println((a * b / gcd) + " " + gcd);
        }
    }
}