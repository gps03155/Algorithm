import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void print(int[] nums, String operator) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            switch (operator.charAt(i)) {
                case 'A':
                    sb.append(nums[0]).append(" ");
                    break;
                case 'B':
                    sb.append(nums[1]).append(" ");
                    break;
                case 'C':
                    sb.append(nums[2]).append(" ");
                    break;
            }
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];

        for (int i = 0; i < 3; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);
        print(nums, sc.next());
    }
}