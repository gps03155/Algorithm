import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(nums);

        int min = nums[0] + nums[n - 1];

        for (int i = 1; i < n - 1; i++) {
            min = Math.min(min, nums[i] + nums[n - 1 - i]);
        }

        System.out.println(min);
    }
}