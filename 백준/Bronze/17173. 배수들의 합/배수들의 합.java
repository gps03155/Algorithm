import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] nums = new int[m];

        for (int i = 0; i < m; i++) {
            nums[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i % nums[j] == 0) {
                    sum += i;
                    break;
                }
            }
        }

        System.out.println(sum);
    }
}