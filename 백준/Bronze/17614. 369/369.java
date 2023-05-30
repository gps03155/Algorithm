import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 1; i <= t; i++) {
            int num = i;
            while (num > 0) {
                int mod = num % 10;
                if (mod == 3 || mod == 6 || mod == 9) {
                    count++;
                }
                num /= 10;
            }
        }

        System.out.println(count);
    }
}