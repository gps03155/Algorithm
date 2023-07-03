import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];

        for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();
        }

        int sum = nums[0];
        for (int j = 1; j < nums.length; j++) {
            if (sum + nums[j] > 100) {
                if (100 - sum >= sum + nums[j] - 100) {
                    sum += nums[j];
                }
                break;
            }

            sum += nums[j];
        }

        System.out.println(sum);
    }
}