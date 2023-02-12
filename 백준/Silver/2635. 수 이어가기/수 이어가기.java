import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        int[] nums = new int[30000];
        int[] result = new int[30000];

        for (int i = n; i >= 1; i--) {
            nums[0] = n;
            nums[1] = i;

            int cnt = 2;
            for (int j = 2; j < nums.length; j++) {
                int num = nums[j - 2] - nums[j - 1];

                if (num < 0) {
                    if (cnt > max) {
                        max = cnt;
                        result = Arrays.copyOf(nums, max);
                    }
                    break;
                }

                nums[j] = num;
                cnt++;
            }
        }

        System.out.println(max);
        for (int i = 0; i < max; i++) {
            if (result[i] >= 0) System.out.print(result[i] + " ");
        }
    }
}