import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] packages = new int[m], singles = new int[m];
		for (int i = 0; i < m; i++) {
			packages[i] = sc.nextInt();
			singles[i] = sc.nextInt();
		}

		Arrays.sort(packages);
		Arrays.sort(singles);

		int price = 0;
		int min = Math.min(packages[0] * ((n + 6) / 6), singles[0] * n);

		while (n > 0) {
			boolean isPackage = packages[0] < singles[0] * n;
			n = isPackage ? n - 6 : n - 1;
			price += isPackage ? packages[0] : singles[0];
		}

		if (price < min) min = price;

		System.out.println(min);
	}
}