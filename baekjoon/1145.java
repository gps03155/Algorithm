import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int min = IntStream.of(nums).min().getAsInt();
				
		for(int i=min;;i++) {
			int num = i;
			
			if(IntStream.of(nums).filter(m -> num % m == 0).count() >= 3) {
				System.out.println(i);
				break;
			}
		}
	}
}
