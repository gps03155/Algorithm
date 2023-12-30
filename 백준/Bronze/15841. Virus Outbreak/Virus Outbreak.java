import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger[] cows = new BigInteger[491];
        
        cows[1] = BigInteger.ONE;
        cows[2] = BigInteger.ONE;

        for (int i = 3; i <= 490; i++) {
            cows[i] = cows[i - 1].add(cows[i - 2]);
        }

        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num < 0) {
                break;
            }
            System.out.printf("Hour %d: %d cow(s) affected%n", num, cows[num]);
        }
    }
}