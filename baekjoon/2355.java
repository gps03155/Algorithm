import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		// 1. long (14228KB 128ms)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		long min = Math.min(a, b);
		long max = Math.max(a, b);
		
		long sum = (max + min) * ((max - min) + 1) / 2;
		
		System.out.println(sum);
		
		// 2. BigInteger (17872KB 212ms)
		Scanner sc = new Scanner(System.in);

		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();

		BigInteger max = a.max(b);
		BigInteger min = a.min(b);
		
		BigInteger sum = max.add(min).multiply(max.subtract(min).add(BigInteger.ONE)).divide(BigInteger.TWO);

		System.out.println(sum);
	}
}
