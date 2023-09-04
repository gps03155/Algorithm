import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] evens = new int[n];
        int[] odds = new int[n];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                evens[i] = num;
            } else {
                odds[i] = num;
            }
        }

        Arrays.sort(odds);
        int sum = 0;
        for (int even : evens) {
            sum += even;
        }

        int oddSum = odds[odds.length - 1];
        for (int i = odds.length - 2; i >= 0; i--) {
            oddSum += odds[i];
            if (oddSum % 2 == 0) {
                sum += oddSum;
                oddSum = 0;
            }
        }

        System.out.println(sum);
    }
}