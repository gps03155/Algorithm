import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int min = Integer.MAX_VALUE, sum = 0;
        for (int i = 0; i < 7; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num % 2 != 0) {
                sum += num;
                min = Math.min(min, num);
            }
        }

        if (sum > 0) {
            System.out.println(sum);
            System.out.println(min);
            return;
        }

        System.out.println(-1);
    }
}