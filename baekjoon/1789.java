import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long s = Long.parseLong(br.readLine());
		long sum = 0;
		
		if(s == 1) {
			System.out.println(1);
			return;
		}
		
		for(int i=1; i<=s; i++) {
			if(sum + i > s) {
				System.out.println(i - 1);
				return;
			}
			
			sum += i;
		}
	}
}
