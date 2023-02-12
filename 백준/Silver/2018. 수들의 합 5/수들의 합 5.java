import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            nums[i] = i;
        }

        int sum = 0, cnt = 0;
        int start = 1, end = 1;

        while (start <= n) {
            if (sum < n) {
                sum += nums[end];
                end++;
            } else {
                sum -= nums[start];
                start++;
            }

            if (sum == n) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}