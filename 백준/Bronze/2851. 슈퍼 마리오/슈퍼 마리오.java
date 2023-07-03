import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];

        for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();
        }

        int max = 0;
        int sum = 0;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            if (Math.abs(sum - 100) <= Math.abs(100 - max)) {
                max = sum;
            }
        }

        System.out.println(max);
    }
}