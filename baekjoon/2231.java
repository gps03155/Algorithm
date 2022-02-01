/** 브루트포스 **/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer m = Integer.parseInt(br.readLine());
		int result = 0;

		for (int i = 1; i < m; i++) {
			int num = i;
			int sum = num;

			while (num > 0) {
				sum += num % 10;
				num /= 10;
			}

			if (sum == m) {
				result = i;
				break;
			}
		}

		System.out.println(result);
	}
}
