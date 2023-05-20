import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 1000 - Integer.parseInt(br.readLine());
        int[] moneys = {500, 100, 50, 10, 5, 1};

        int count = 0;
        for (int i = 0; i < moneys.length; i++) {
            count += n / moneys[i];
            n %= moneys[i];
        }

        System.out.println(count);
    }
}