import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	
	public static int dynamicSum(int[] dp, int num) {
		if(dp[num] > 0) return dp[num];
		return dynamicSum(dp, num-1) + dynamicSum(dp, num-2) + dynamicSum(dp, num-3);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		int[] dp = new int[12];
		
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for(int i=0; i<test; i++) {
			int num = Integer.parseInt(br.readLine());
			System.out.println(dynamicSum(dp, num));
		}
	}
}
