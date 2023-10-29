import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        int count = 0;

        while (n > 0) {
            long pow = (long) Math.pow(2, count++);

            if (pow >= n) {
                break;
            }
        }

        System.out.println(count);
    }
}