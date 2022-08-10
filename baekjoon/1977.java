import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int min = Integer.MAX_VALUE;
		int sum = 0;
		
		for(int i=(int) Math.sqrt(m); i<=Math.sqrt(n); i++) {
			int pow = i * i;
			
			if(m <= pow && pow <= n) {
				sum += pow;
				
				if(pow < min) {
					min = pow;
				}
			}
		}
		
		if(sum > 0) {
			System.out.println(sum);
			System.out.println(min);
		}
		else {
			System.out.println(-1);
		}
	}
}
