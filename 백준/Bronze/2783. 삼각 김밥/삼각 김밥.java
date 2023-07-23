import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double min = (double) sc.nextInt() / sc.nextInt();

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            double num = (double) sc.nextInt() / sc.nextInt();
            min = Math.min(min, num);
        }

        System.out.printf("%.2f", min * 1000);
    }
}