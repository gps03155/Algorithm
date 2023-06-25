import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[(n - 9) / 3 + 1];

        nums[0] = 1;

        for (int i = 12; i <= n; i++) {
            int index = (i - 9) / 3;
            nums[index] = nums[index - 1] + index + 1;
        }

        System.out.println(nums[(n - 9) / 3]);
    }
}