import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		
		long[] nums = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
		long sum = 0;
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length; j++) {
				long max = nums[i] >= nums[j]? nums[i] : nums[j];
				long min = nums[i] <= nums[j]? nums[i] : nums[j];
				
				sum += max - min;
			}
		}
		
		System.out.println(sum);
	}
}
