import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		int count = 1;
		int mod = a % b;
		int div = a / b;
		
		while(count <= n) {
			mod *= 10;
			div = mod / b;
			mod %= b;
			count++;
		}
		
		System.out.println(div);
	}
}
