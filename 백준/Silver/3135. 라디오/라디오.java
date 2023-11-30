import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());

        // case1. 최초 풀이
//        int[] nums = new int[n];
//        for (int i = 0; i < n; i++) {
//            nums[i] = Integer.parseInt(br.readLine());
//        }
//
//        Arrays.sort(nums);
//
//        int[] minNums = new int[n];
//        for (int i = 0; i < nums.length; i++) {
//            minNums[i] = Math.abs(end - nums[i]);
//        }
//
//        int min = Math.abs(start - end);
//        boolean isJump = false;
//
//        int current = start;
//        for (int i = 0; i < minNums.length; i++) {
//            if (minNums[i] < min) {
//                isJump = true;
//                current = nums[i];
//                min = minNums[i];
//            }
//        }
//
//        int count = 0;
//        if (isJump) {
//            count++;
//        }
//        if (!isJump || current != start) {
//            count += Math.abs(current - end);
//        }
//        System.out.println(count);

        // case2. 개선 풀이
        int min = Math.abs(start - end);
        for (int i = 0; i < n; i++) {
            min = Math.min(min, Math.abs(Integer.parseInt(br.readLine()) - end) + 1);
        }

        System.out.println(min);
    }
}