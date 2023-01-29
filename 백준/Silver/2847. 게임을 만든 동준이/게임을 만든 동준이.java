import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Integer[] nums = new Integer[t];

        for (int i = 0; i < t; i++) {
            nums[i] = sc.nextInt();
        }

        int cnt = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] >= nums[i]) {
                while (nums[i - 1] >= nums[i]) {
                    nums[i - 1]--;
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}