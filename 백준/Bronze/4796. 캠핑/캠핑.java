import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        while (true) {
            int l = sc.nextInt();
            int p = sc.nextInt();
            int v = sc.nextInt();

            if (l == 0 && p == 0 && v == 0) {
                return;
            }

            int day = v / p;
            int mod = Math.min(l, v % p);

            System.out.println("Case " + i + ": " + (day * l + mod));
            i++;
        }
    }
}