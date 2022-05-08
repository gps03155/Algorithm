import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		Integer x = Integer.parseInt(st.nextToken());
		Integer y = Integer.parseInt(st.nextToken());
		Integer w = Integer.parseInt(st.nextToken());
		Integer h = Integer.parseInt(st.nextToken());
		
		int halfW = w / 2;
		int halfH = h / 2;
		int result = 0;
		
		// 1사분면
		if(x <= halfW && y >= halfH) {
			result = Math.min(x - 0, h - y);
		}
		
		// 2사분면
		if(x > halfW && y > halfH) {
			result = Math.min(w - x, h - y);
		}
		
		// 3사분면
		if(x < halfW && y < halfH) {
			result = Math.min(x - 0, y - 0);
			
		}
		
		// 4사분면
		if(x >= halfW && y <= halfH) {
			result = Math.min(w - x, y-0);
		}
		
		System.out.println(result);
	}
}
