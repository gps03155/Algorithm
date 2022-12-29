import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		long[] cards = new long[n];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			cards[i] = Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(cards);

		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < m; i++) {
			long result = Arrays.binarySearch(cards, Long.parseLong(st.nextToken()));
			System.out.print((result > -1? 1 : 0) + " ");
		}
	}
}
