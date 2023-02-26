import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[][] comb = new boolean[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            int num2 = sc.nextInt();

            comb[num][num2] = true;
            comb[num2][num] = true;
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (comb[i][j]) {
                    continue;
                }

                for (int k = j + 1; k <= n; k++) {
                    if (comb[i][k] || comb[j][k]) {
                        continue;
                    }

                    count++;
                }
            }
        }

        System.out.println(count);
    }
}