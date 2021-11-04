import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.Stream;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] nums = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int result = 0;
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i] >= m) continue;
			
			for(int j=i+1; j<nums.length; j++) {
				if(nums[j] >= m) continue;
				
				for(int k=j+1; k<nums.length; k++) {
					if(nums[k] >= m) continue;
					
					if(result > m) break;
					int sum = nums[i] + nums[j] + nums[k];
					
					if(sum <= m && result < sum) {
						result = sum;
					}
				}
			}
		}
		
		System.out.println(result);
	}
}
