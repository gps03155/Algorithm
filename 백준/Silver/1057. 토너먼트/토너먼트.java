import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int people = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int cnt = 1;

		while (people > 0) {
			if (a % 2 != 0 && b == a + 1 || b % 2 != 0 && a == b + 1) {
				System.out.println(cnt);
				return;
			}

			a = a % 2 == 0 ? a / 2 : a / 2 + 1;
			b = b % 2 == 0 ? b / 2 : b / 2 + 1;
			people /= 2;
			cnt++;
		}

		System.out.println(-1);
	}
}