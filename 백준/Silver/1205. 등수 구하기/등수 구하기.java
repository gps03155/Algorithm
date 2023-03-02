import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long score = sc.nextLong();
        int p = sc.nextInt();

        long[] scores = new long[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextLong();
        }

        int rank = 1;

        if (n == p && scores[scores.length - 1] >= score) {
            rank = -1;
        } else {
            for (int i = 0; i < scores.length; i++) {
                if (score < scores[i]) {
                    rank++;
                } else {
                    break;
                }
            }
        }

        System.out.println(rank);
    }
}