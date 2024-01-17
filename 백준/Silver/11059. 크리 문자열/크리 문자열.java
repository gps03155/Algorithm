import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean isCri(String s) {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            sum1 += Character.getNumericValue(s.charAt(i));
        }

        for (int i = s.length() / 2; i < s.length(); i++) {
            sum2 += Character.getNumericValue(s.charAt(i));
        }

        return sum1 == sum2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j += 2) {
                if (isCri(s.substring(i, j + 1))) {
                    max = Math.max(s.substring(i, j + 1).length(), max);
                }
            }
        }
        System.out.println(max);
    }
}