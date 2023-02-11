import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        double[] nums = new double[t];

        for (int i = 0; i < t; i++) {
            nums[i] = sc.nextDouble();
        }

        double max = Arrays.stream(nums).max().getAsDouble();
        for (int i = 0; i < nums.length; i++) {
            double num = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                num *= nums[j];
                if (num > max) {
                    max = num;
                }
            }
        }

        System.out.print(String.format("%.3f", max));
    }
}