import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int b = sc.nextInt();
        int c = sc.nextInt();
        long count = 0;

        for (int num : nums) {
            num -= b;
            count++;

            if (num > 0) {
                count += num / c;

                if (num % c != 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}