import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] nums = new int[n];


            for (int j = 0; j < n; j++) {
                nums[j] = sc.nextInt();
            }

            long max = Long.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                long sum = 0;

                for (int k = j; k < n; k++) {
                    sum += nums[k];
                    if (sum > max) {
                        max = sum;
                    }
                }
            }

            System.out.println(max);
        }
    }
}