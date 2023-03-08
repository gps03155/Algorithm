import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static long gcd(long a, long b) {
		return b > 0? gcd(b, a % b) : a;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long n = Long.parseLong(br.readLine());
		
		for(int i=0; i<n; i++) {
			String[] nums = br.readLine().split(" ");
			
			Long a = Long.parseLong(nums[0]);
			Long b = Long.parseLong(nums[1]);
			
			System.out.println(a * b / gcd(a, b));
		}
	}
}