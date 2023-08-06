import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                return;
            }

            System.out.println(num % n == 0 ? String.format("%d is a multiple of %d.", num, n) : String.format("%d is NOT a multiple of %d.", num, n));
        }
    }
}