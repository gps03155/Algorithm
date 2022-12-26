import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static BigInteger getFactorial(int num) {
		BigInteger a = BigInteger.ONE;

		for (int i = 1; i <= num; i++) {
			a = a.multiply(new BigInteger(String.valueOf(i)));
		}

		return a;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());

		for (int i = 0; i < test; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			System.out.println(getFactorial(m).divide((getFactorial(m - n).multiply(getFactorial(n)))));
		}
	}
}
