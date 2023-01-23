import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			String[] n = br.readLine().split(" ");

			long sum = 0;
			for (int j = 1; j < n.length; j++) {
				for (int k = j + 1; k < n.length; k++) {
					sum += gcd(Integer.parseInt(n[j]), Integer.parseInt(n[k]));
				}
			}

			System.out.println(sum);
		}
	}
}