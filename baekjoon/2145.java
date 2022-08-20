import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) break;
			
			int sum = 0;
			
			while(true) {
				sum += n % 10;
				n /= 10;
				
				if(n == 0) {
					n = sum;
					
					if(n < 10) {
						break;
					}
					
					sum = 0;
				}
			}
			
			System.out.println(sum);
		}
	}
}
