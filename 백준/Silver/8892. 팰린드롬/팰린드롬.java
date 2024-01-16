import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean isPalindrom(String s) {
        int i = 0;
        int j = s.length() - 1;
        for (; i < s.length() / 2; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            String[] arr = new String[k];
            for (int j = 0; j < k; j++) {
                arr[j] = br.readLine();
            }

            boolean isMake = false;
            loop:
            for (int j = 0; j < k; j++) {
                for (int m = 0; m < k; m++) {
                    if (j == m) {
                        continue;
                    }

                    String s = arr[j].concat(arr[m]);
                    if (isPalindrom(s)) {
                        System.out.println(s);
                        isMake = true;
                        break loop;
                    }
                }
            }
            if (!isMake) {
                System.out.println(0);
            }
        }
    }
}