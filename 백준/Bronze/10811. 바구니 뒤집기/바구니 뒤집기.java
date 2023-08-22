import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int endNum = end - 1;

            int[] copy = Arrays.copyOf(nums, nums.length);
            for (int j = start - 1; j < end; j++) {
                nums[j] = copy[endNum--];
            }
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}