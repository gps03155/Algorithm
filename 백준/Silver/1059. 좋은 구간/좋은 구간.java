import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] s = new int[t];

        for (int i = 0; i < s.length; i++) {
            s[i] = sc.nextInt();
        }

        int n = sc.nextInt();

        if (Arrays.stream(s).anyMatch(m -> m == n)) {
            System.out.println(0);
            return;
        }

        if (n >= Arrays.stream(s).max().getAsInt()) {
            System.out.println(0);
            return;
        }

        Arrays.sort(s);

        int index = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] < n) {
                index = i;
            }
        }

        int cnt = 0;
        int start = n < s[0] ? 1 : s[index] + 1;
        int end = n < s[0] ? s[0] - 1 : s[index + 1] - 1;

        for (int i = start; i <= n; i++) {
            for (int j = n; j <= end; j++) {
                if (i == j) {
                    continue;
                }

                cnt++;
            }
        }

        System.out.println(cnt);
    }
}