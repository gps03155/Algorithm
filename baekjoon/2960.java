import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		boolean[] primes = new boolean[n + 1];
		int count = 0;

		for (int i = 2; i <= n; i++) {
			if (primes[i])
				continue;

			for (int j = i; j <= n; j += i) {
				if (primes[j])
					continue;

				count++;
				primes[j] = true;

				if (count == k) {
					System.out.println(j);
					return;
				}
			}
		}
	}
}
