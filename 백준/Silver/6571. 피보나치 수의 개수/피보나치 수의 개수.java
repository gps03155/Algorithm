import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<BigInteger, BigInteger> fibo = new HashMap<>();
        fibo.put(BigInteger.ZERO, BigInteger.ONE);
        fibo.put(BigInteger.ONE, BigInteger.ONE);

        BigInteger size = BigInteger.valueOf(1001);
        for (BigInteger i = BigInteger.TWO; i.compareTo(size) <= 0; i = i.add(BigInteger.ONE)) {
            fibo.put(i, fibo.get(i.subtract(BigInteger.ONE)).add(fibo.get(i.subtract(BigInteger.TWO))));
        }

        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            BigInteger a = new BigInteger(st.nextToken());
            BigInteger b = new BigInteger(st.nextToken());

            if (a.equals(BigInteger.ZERO) && b.equals(BigInteger.ZERO)) {
                break;
            }

            int count = 0;
            for (BigInteger i = BigInteger.ONE; i.compareTo(size) <= 0; i = i.add(BigInteger.ONE)) {
                if (a.compareTo(fibo.get(i)) <= 0 && fibo.get(i).compareTo(b) <= 0) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}