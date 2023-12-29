import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Long[] nums = new Long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(nums, Collections.reverseOrder());
        boolean isPossible = false;

        // 가장 긴 변의 길이가 나머지 두 변의 합보다 작아야함
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] < nums[i + 1] + nums[i + 2]) {
                isPossible = true;
                break;
            }
        }
        
        System.out.println(isPossible ? "possible" : "impossible");
    }
}