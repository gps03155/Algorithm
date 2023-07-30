import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double x = a * b;
        double answer = 0;
        for (double i = x; i > 0; i--) {
            double num = Math.ceil(i / a);
            if (num < b) {
                break;
            }
            answer = i;
        }

        System.out.println((int) answer);
    }
}