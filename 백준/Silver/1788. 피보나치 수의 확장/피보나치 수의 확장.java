import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int absN = Math.abs(n);
        int[] fibo = new int[1000001];
        fibo[0] = 0;
        fibo[1] = fibo[2] = 1;
        for (int i = 3; i <= absN; i++) {
            fibo[i] = (fibo[i - 1] + fibo[i - 2]) % 1000000000;
        }

        System.out.println(n == 0 ? 0 : n < 0 && n % 2 == 0 ? -1 : 1);
        System.out.println(fibo[absN]);
    }
}