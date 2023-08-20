import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] balls = new int[n];

        for (int i = 0; i < n; i++) {
            balls[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            int start = sc.nextInt() - 1;
            int end = sc.nextInt() - 1;

            int temp = balls[start];
            balls[start] = balls[end];
            balls[end] = temp;
        }

        for (int ball : balls) {
            System.out.print(ball + " ");
        }
    }
}