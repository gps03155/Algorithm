import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            char[] a = br.readLine().toCharArray();
            char[] b = br.readLine().toCharArray();

            int white = 0, black = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] != b[j]) {
                    if (a[j] == 'W') {
                        white++;
                        continue;
                    }
                    black++;
                }
            }

            int result = 0;
            while (white > 0 || black > 0) {
                if (white > 0 && black > 0) {
                    result++;
                    white--;
                    black--;
                } else if (white > 0) {
                    result++;
                    white--;
                } else if (black > 0) {
                    result++;
                    black--;
                }
            }

            System.out.println(result);
        }
    }
}