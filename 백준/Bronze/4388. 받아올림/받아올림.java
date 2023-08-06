import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 && b == 0) {
                return;
            }

            int count = 0, prev = 0;
            while (a > 0 || b > 0) {
                int n = a % 10;
                int n2 = b % 10;

                if (n + n2 + prev >= 10) {
                    count++;
                }

                prev = (n + n2 + prev) / 10;
                a /= 10;
                b /= 10;
            }

            System.out.println(count);
        }
    }
}