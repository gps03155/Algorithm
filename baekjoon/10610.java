import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nums = br.readLine().split("");

		Arrays.sort(nums, Collections.reverseOrder());
		System.out.println(new BigInteger(String.join("", nums)).mod(BigInteger.valueOf(30)) == BigInteger.ZERO ? String.join("", nums) : -1);
	}
}
