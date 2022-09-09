import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int origin = Integer.parseInt(br.readLine());
		int num = origin;
		int count = 0;
		
		while(true) {
			int first = num / 10;
			int second = num % 10;
			
			num = Integer.parseInt(String.valueOf(second) + String.valueOf((first + second) % 10));
			count++;
			
			if(num == origin) {
				System.out.println(count);
				break;
			}
		}
	}
}
