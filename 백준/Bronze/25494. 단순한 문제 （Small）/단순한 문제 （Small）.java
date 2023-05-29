import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int count = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            for (int x = 1; x <= a; x++) {
                for (int y = 1; y <= b; y++) {
                    for (int z = 1; z <= c; z++) {
                        if (x % y == y % z && y % z == z % x) {
                            count++;
                        }
                    }
                }
            }

            System.out.println(count);

        }
    }
}