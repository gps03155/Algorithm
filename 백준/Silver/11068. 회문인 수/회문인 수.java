import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String radix(int num, int n) {
        StringBuilder sb = new StringBuilder();

        if (num == 0) return "0";
        while (num > 0) {
            if (num % n < 10) {
                sb.append(num % n);
            } else {
                sb.append((char) (num % n - 10 + 'A'));
            }
            num /= n;
        }

        return sb.reverse().toString();
    }

    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            boolean isPalindrome = false;
            for (int i = 2; i <= 64; i++) {
                if (isPalindrome(radix(n, i))) {
                    isPalindrome = true;
                    break;
                }
            }
            sb.append(isPalindrome ? 1 : 0).append("\n");
        }
        System.out.println(sb);
    }
}