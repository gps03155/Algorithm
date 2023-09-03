import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int count = 0;
        int[] moneys = new int[m];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a < b - 1) {
                moneys[i] = n - a;
                continue;
            }
            moneys[i] = Integer.MAX_VALUE;
            count++;
        }

        Arrays.sort(moneys);
        int sum = 0;
        for (int i = 0; i < moneys.length; i++) {
            if (i < m - 1 - count) {
                sum += moneys[i];
            }
        }
        System.out.println(sum);
    }
}