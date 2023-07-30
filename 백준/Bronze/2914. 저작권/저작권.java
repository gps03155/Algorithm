import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // case1
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a * (b - 1) + 1);

        // case2
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//
//        double x = a * b;
//        double answer = 0;
//        for (double i = x; i > 0; i--) {
//            double num = Math.ceil(i / a);
//            if (num < b) {
//                break;
//            }
//            answer = i;
//        }
//
//        System.out.println((int) answer);
    }
}