import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int cnt = 0;
		while (a != b) {
			a = (a + 1) / 2;
			b = (b + 1) / 2;
			cnt++;
		}

		System.out.println(cnt);
	}
}
