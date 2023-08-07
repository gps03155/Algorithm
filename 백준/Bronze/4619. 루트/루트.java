import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int b = sc.nextInt();
            int n = sc.nextInt();

            if (b == 0 && n == 0) {
                return;
            }

            int prev = Integer.MAX_VALUE;
            int a = 0;
            for (int i = 1; i <= 1000000; i++) {
                int cur = (int) Math.abs(Math.pow(i, n) - b);
                if (cur >= prev) {
                    break;
                }

                a = i;
                prev = cur;
            }

            System.out.println(a);
        }
    }
}