import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int[][] nums = new int[46][2];
        nums[0][0] = 1;
        nums[0][1] = 0;

        for (int i = 1; i <= k; i++) {
            nums[i][0] = nums[i - 1][1];
            nums[i][1] = nums[i - 1][0] + nums[i - 1][1];
        }

        System.out.println(nums[k][0] + " " + nums[k][1]);
    }
}