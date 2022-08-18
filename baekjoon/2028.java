import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.UUID;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < test; i++) {
			int n = Integer.parseInt(br.readLine());
			String pow = String.valueOf(n * n);

			System.out.println(pow.endsWith(String.valueOf(n)) ? "YES" : "NO");
		}
	}
}
