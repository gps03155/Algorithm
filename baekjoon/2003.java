import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long m = sc.nextLong();

		int[] nums = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

		int start = 0, end = 0, count = 0;

		while (start < nums.length && end < nums.length) {
			long sum = 0;

			for (int i = start; i <= end; i++) {
				sum += nums[i];
			}
			
			if (sum == m) {
				count++;
				sum = 0;
				start++;
			} else if (sum < m) {
				end++;
			} else if (sum > m) {
				start++;
			}
		}

		System.out.println(count);
	}
}
