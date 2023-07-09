import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int[] nums = new int[1001];

    public static void setNums(int k) {
        for (int i = 1; i <= k; i++) {
            if (nums[i] == 0) {
                nums[i] = (i * (i + 1)) / 2;
            }
        }
    }

    public static boolean isEureka(int[] arr, int num) {
        for (int i = 1; i < num; i++) {
            for (int j = 1; j < num; j++) {
                for (int k = 1; k < num; k++) {
                    if (arr[i] + arr[j] + arr[k] == num) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            setNums(n);
            System.out.println(isEureka(nums, n) ? 1 : 0);
        }
    }
}