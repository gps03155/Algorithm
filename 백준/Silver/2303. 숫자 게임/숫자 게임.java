import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static int[] result;

    public static void comb(int people, int[] arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            result[people] = Math.max(result[people], sum(arr, visited, n) % 10);
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            comb(people, arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }

    public static int sum(int[] arr, boolean[] visited, int n) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                sum += arr[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] person = new int[n][5];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                person[i][j] = sc.nextInt();
            }
        }

        boolean[] visited;
        result = new int[n];

        for (int i = 0; i < n; i++) {
            visited = new boolean[5];
            comb(i, person[i], visited, 0, 5, 3);
        }

        int max = Arrays.stream(result).max().getAsInt();
        for (int i = n - 1; i >= 0; i--) {
            if (result[i] == max) {
                System.out.println(i + 1);
                return;
            }
        }
    }
}