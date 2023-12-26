import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            br.readLine();
            String[] nums = br.readLine().split("");
            Arrays.sort(nums, Collections.reverseOrder());
            long num = Long.parseLong(String.join("", Arrays.copyOfRange(nums, 0, nums.length - 1)));
            System.out.println(num + Long.parseLong(nums[nums.length - 1]));
        }
    }
}