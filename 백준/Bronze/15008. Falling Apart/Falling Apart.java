import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int alice = 0, bob = 0;
        Integer[] nums = new Integer[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums, Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                alice += nums[i];
            } else {
                bob += nums[i];
            }
        }

        System.out.println(alice + " " + bob);
    }
}