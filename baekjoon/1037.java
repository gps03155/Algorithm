import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		int[] nums = new int[test];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int index = 0;
		
		while(st.hasMoreTokens()) {
			nums[index] = Integer.parseInt(st.nextToken());
			index++;
		}
		
		int max = IntStream.of(nums).max().getAsInt();
		int min = IntStream.of(nums).min().getAsInt();
		
		System.out.println(max * min);
	}
}
