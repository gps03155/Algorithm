import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        BigInteger ans = BigInteger.ZERO;
        for (int i = 0; i < s.length(); i++) {
            ans = ans.add(BigInteger.valueOf(s.charAt(i) - 96).multiply(BigInteger.valueOf(31).pow(i)));
        }
        System.out.println(ans.remainder(BigInteger.valueOf(1234567891)));
    }
}