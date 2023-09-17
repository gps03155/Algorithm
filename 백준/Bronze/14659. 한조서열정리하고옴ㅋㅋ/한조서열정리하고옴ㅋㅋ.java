import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];

        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        int maxCount = 0;
        for (int i = 0; i < heights.length; i++) {
            int count = 0;
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[i] > heights[j]) {
                    count++;
                } else {
                    break;
                }
            }
            maxCount = Math.max(count, maxCount);
        }

        System.out.println(maxCount);
    }
}