import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < b.length() - a.length() + 1; i++) {
			int cnt = 0;

			for (int j = 0; j < a.length(); j++) {
				if (a.charAt(j) != b.charAt(i + j)) {
					cnt++;
				}
			}

			if (cnt < min)
				min = cnt;
		}

		System.out.println(min);
	}
}