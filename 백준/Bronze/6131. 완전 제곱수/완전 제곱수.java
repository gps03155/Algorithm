import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int b = 1; b <= 500; b++) {
            for (int a = b; a <= 500; a++) {
                if (a * a == b * b + n) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}