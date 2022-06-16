import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Integer.parseInt(br.readLine());
		int song = 1;
		int time = 0;
		
		while(n > 0) {
			if(n < song) {
				song = 1;
			}
			
			n -= song;
			song++;
			time++;
		}
		
		System.out.println(time);
	}
}
