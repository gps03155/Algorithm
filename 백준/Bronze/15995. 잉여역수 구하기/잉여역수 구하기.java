import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= 10000; i++) {
            if ((a * i) % m == 1) {
                System.out.println(i);
                return;
            }
        }
    }
}