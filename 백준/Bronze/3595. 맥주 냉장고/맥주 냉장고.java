import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int minSize = Integer.MAX_VALUE;
        int[] nums = {0, 0, 0};

        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= a; b++) {
                if (a * b > n) break;

                for (int c = 1; c <= b; c++) {
                    if (a * b * c > n) break;
                    if (a * b * c == n) {
                        int size = 2 * a * b + 2 * a * c + 2 * b * c;
                        if (size < minSize) {
                            minSize = size;
                            nums[0] = a;
                            nums[1] = b;
                            nums[2] = c;
                        }
                    }
                }
            }
        }

        System.out.println(nums[0] + " " + nums[1] + " " + nums[2]);
    }
}