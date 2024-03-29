import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;

		for (int i = 0; i < 8; i++) {
			String[] cols = br.readLine().split("");

			for (int j = i % 2; j < cols.length; j+=2) {
				if("F".equals(cols[j])) count++;
			}
		}
		
		System.out.println(count);
	}
}
