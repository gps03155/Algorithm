import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = -1000; i <= 1000; i++) {
            if (i * i + 2 * i * a + b == 0) {
                System.out.print(i + " ");
            }
        }
    }
}