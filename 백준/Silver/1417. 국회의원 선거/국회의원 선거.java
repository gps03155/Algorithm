import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] nums = new Integer[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        if (nums.length == 1) {
            System.out.println(0);
            return;
        }

        int dasom = nums[0];
        int count = 0;

        Integer[] reverse = Arrays.copyOfRange(nums, 1, nums.length);
        Arrays.sort(reverse, Collections.reverseOrder());

        while (true) {
            boolean isDone = true;

            for (int i = 0; i < reverse.length; i++) {
                if (reverse[i] >= dasom) {
                    count++;
                    reverse[i]--;
                    dasom++;
                    isDone = false;
                    Arrays.sort(reverse, Collections.reverseOrder());
                    break;
                }
            }

            if (isDone) {
                break;
            }
        }

        System.out.println(count);
    }
}