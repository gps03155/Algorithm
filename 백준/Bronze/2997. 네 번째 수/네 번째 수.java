import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);
        int num = Math.min(nums[2] - nums[1], nums[1] - nums[0]);

        for (int i = 0; i < nums.length; i++) {
            boolean isExist = false;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + num == nums[j]) {
                    isExist = true;
                }
            }

            if (!isExist) {
                System.out.println(nums[i] + num);
                return;
            }
        }
    }
}