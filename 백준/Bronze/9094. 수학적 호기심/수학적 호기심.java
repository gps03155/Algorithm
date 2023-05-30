import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int count = 0;
            for (int b = 1; b < n; b++) {
                for (int a = 1; a < b; a++) {
                    if (((a * a + b * b + m) % (a * b)) == 0) {
                        count++;
                    }
                }
            }

            System.out.println(count);
        }

    }
}