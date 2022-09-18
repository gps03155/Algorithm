import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		int k = Integer.parseInt(input[1]);
		
		int[] nums = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
		int[] result = nums.clone();
		
		for (int i = 0; i < k; i++) {
			result = new int[result.length - 1];
			
			for (int j = 0; j < nums.length-1; j++) {
				result[j] = nums[j+1] - nums[j];
			}
			
			nums = result.clone();
		}
		
		System.out.println(Arrays.stream(result).mapToObj(String::valueOf).collect(Collectors.joining(",")));
	}
}
