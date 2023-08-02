import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        for (int j = 0; j <= 99; j++) {
            for (int k = 0; k <= 99; k++) {
                if (n - j - k == 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}