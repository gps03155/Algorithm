import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(1);
            return;
        }

        String a = "8".repeat(n / 2);

        if (a.isEmpty()) {
            System.out.println("0");
            return;
        }

        String b = "4".repeat(n % 2);
        System.out.println(b + a);
    }
}