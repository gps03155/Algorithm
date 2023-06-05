import java.io.IOException;

public class Main {
    public static int getSum(int n, int radix) {
        int sum = 0;
        while (n > 0) {
            sum += n % radix;
            n /= radix;
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
        for (int i = 1000; i <= 9999; i++) {
            int a = getSum(i, 10);
            int b = getSum(i, 12);
            int c = getSum(i, 16);

            if (a == b && b == c && c == a) {
                System.out.println(i);
            }
        }
    }
}