import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // front
        int frontCnt = 1;
        int frontMax = 1;

        // back
        int backCnt = 1;
        int backMax = 1;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i + 1] >= nums[i]) frontCnt++;
            else frontCnt = 1;

            if (nums[i] >= nums[i + 1]) backCnt++;
            else backCnt = 1;

            if (frontCnt > frontMax) frontMax = frontCnt;
            if (backCnt > backMax) backMax = backCnt;
        }

        System.out.print(Math.max(backMax, frontMax));
    }
}