import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int d = Integer.parseInt(br.readLine());

            int max = 0;
            for (int j = 1; j <= d; j++) {
                if (j + (j * j) <= d) {
                    max = Math.max(max, j);
                }
            }

            System.out.println(max);
        }
    }
}