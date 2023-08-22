import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] scores = new Integer[n];

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        Arrays.sort(scores, Collections.reverseOrder());
        System.out.println(scores[k - 1]);
    }
}