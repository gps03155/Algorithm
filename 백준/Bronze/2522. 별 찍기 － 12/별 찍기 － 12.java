import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < 2 * n - 1; i++) {
            if (i == n - 1) {
                System.out.print("*".repeat(n));
            } else {
                int num = Math.abs(n - i - 1);
                System.out.print(" ".repeat(num) + "*".repeat(n - num));
            }
            System.out.println();
        }
    }
}