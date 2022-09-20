import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		for(int i=0; i<test; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int min = Math.min(a, b);
			int max = Math.max(a, b);
			
			int num = min;
			
			while(true) {
				if(num % min == 0 && num % max == 0) {
					System.out.println(num);
					break;
				}
				
				num += min;
			}
		}
	}
}
