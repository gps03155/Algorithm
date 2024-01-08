import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        BigInteger[] arr = new BigInteger[10001];
        arr[0] = BigInteger.ONE;
        arr[1] = BigInteger.ONE;
        arr[2] = BigInteger.TWO;
        for (int i = 3; i < arr.length; i++) {
            arr[i] = arr[i - 1].add(arr[i - 2]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            sb.append("Case #").append(i + 1).append(": ").append(arr[a - 1].mod(new BigInteger(st.nextToken()))).append("\n");
        }
        System.out.println(sb);
    }
}