import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int count = 0;

		while (n >= 3) {
			if (n % 5 == 0) {
				count += (n / 5);
				n %= 5;
			}

			if (n >= 3) {
				n -= 3;
				count++;
			}

			if (0 < n && n < 3) {
				count = 0;
			}
		}

		System.out.println(count == 0 ? -1 : count);
	}
}
