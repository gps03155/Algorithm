import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int max = 0;
        while (k > 0) {
            if (n / 2 >= m) {
                n--;
            } else {
                m--;
            }
            k--;
        }

        System.out.println(Math.min(n / 2, m));
    }
}