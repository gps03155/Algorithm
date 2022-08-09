import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < test; i++) {
			int n = Integer.parseInt(br.readLine());
			int notation = 2;
			int answer = 0;
			
			while(notation <= n) {
				int last = n % notation;
				notation++;
				
				if(last == 0) {
					answer++;
				}
			}
			
			System.out.println(answer);
		}
	}
}
